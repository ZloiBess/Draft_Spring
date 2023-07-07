package org.example.component;

public class Dog extends Pet{

    public Dog(String name){
        super(name);
    }

    @Override
    String voice() {
        return "Gaw";
    }
}
