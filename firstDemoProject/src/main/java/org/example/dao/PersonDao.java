package org.example.dao;

import org.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Person show(int id) {
       return jdbcTemplate.query("select * from person where id = ?", new Object[]{id}, new PersonMapper())
               .stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update("insert into person values (?, ?, ?, ?)",
                person.getId(),
                person.getName(),
                person.getAge(),
                person.getEmail()
        );
    }

    public void update(int id, Person person) {
        jdbcTemplate.update("update person set name=?, age=?, email=? where id = ?",
                person.getName(),
                person.getAge(),
                person.getEmail(),
                id
        );
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from person where id = ?", id);
    }
}
