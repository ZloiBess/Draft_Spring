package org.example;

public class Dog extends Pet{

    public Dog(String name){
        super(name);
    }

    @Override
    String voice() {
        return "Gaw";
    }
}
