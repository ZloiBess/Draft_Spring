package org.example;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    String voice() {
        return "Myau";
    }
}
