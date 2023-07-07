package org.example.component;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    String voice() {
        return "Myau";
    }
}
