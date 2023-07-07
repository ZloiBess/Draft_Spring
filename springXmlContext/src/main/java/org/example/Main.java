package org.example;

import org.example.component.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Person personCat = context.getBean("personAndCat", Person.class);

        Person personDog = context.getBean("personAndDog", Person.class);

        System.out.println(personCat);
        System.out.println(personDog);

    }
}