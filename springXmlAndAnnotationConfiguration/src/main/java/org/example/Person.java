package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component("personUsa")
@Data
public class Person {
    private String name;
    private int age;
    @Value("${person.usa.notes}")
    private List<String> notes = new ArrayList<>();
    private Address address;

    @Autowired
    public Person(@Value("${person.usa.name}") String name,
                  @Value("${person.usa.age}")int age,
                  @Qualifier("addressUsa") Address address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
