package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressUsa")
@Data
public class Address {

    private String country;

    public Address(@Value("${address.person.usa}")String country) {
        this.country = country;
    }
}
