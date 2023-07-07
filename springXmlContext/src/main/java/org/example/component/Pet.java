package org.example.component;

import lombok.Data;

@Data
public abstract class Pet {
    private String name;
    abstract String voice();

    public Pet(String name) {
        this.name = name;
    }
}
