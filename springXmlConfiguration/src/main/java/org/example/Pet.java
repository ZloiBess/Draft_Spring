package org.example;

import lombok.Data;

@Data
public abstract class Pet {
    private String name;
    abstract String voice();

    public Pet(String name) {
        this.name = name;
    }
}
