package org.example.component;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Person {
    private String name;
    private int age;
    private List<String> notes = new ArrayList<>();
    private Pet pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
