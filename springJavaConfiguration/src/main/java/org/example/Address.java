package org.example;

import lombok.Data;

@Data
public class Address {
    private String county;
    private String city;
    private String street;

    public Address(String county, String city, String street) {
        this.county = county;
        this.city = city;
        this.street = street;
    }
}
