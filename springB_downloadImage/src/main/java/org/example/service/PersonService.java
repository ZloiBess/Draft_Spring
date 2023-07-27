package org.example.service;

import org.example.model.Person;
import org.example.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void save(Person person, MultipartFile multipartFile){
        try {
            person.setImage(multipartFile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        personRepo.save(person);
    }

    public List<Person> index(){
        List<Person> list = new ArrayList<>();
        personRepo.findAll().forEach(list::add);
        return list;

    }

    public Person getById(Long id){
        return personRepo.findById(id).orElse(null);
    }
}
