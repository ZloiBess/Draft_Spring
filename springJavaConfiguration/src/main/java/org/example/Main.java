package org.example;

import org.example.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfiguration.class);

        Person usa = context.getBean("personFromUsa", Person.class);
        System.out.println(usa);


    }
}