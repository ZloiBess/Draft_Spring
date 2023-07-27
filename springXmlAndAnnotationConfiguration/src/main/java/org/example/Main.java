package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("contextWithAnnotation.xml");

        Person person = context.getBean("personUsa", Person.class);
        System.out.println(person);
    }

}
