package org.example.config;

import org.example.Address;
import org.example.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.component")
@PropertySource("spaceValuesForAddressUsa.properties")
public class MainConfiguration {

    @Value("${country}")
    private String country;
    @Value("${city}")
    private String city;
    @Value("${street}")
    private String street;
    @Bean
    public Address addressUsa() {
        return new Address(country, city, street);
    }

    @Bean
    public Person personFromUsa() {
        return new Person("Bulochka", 99, addressUsa());
    }

//    @Bean
//    public Address addressUkr() {
//        return new Address("Ukraine", "Freedom", "Goodruskiy");
//    }
//
//    @Bean
//    public Person personFromUkr() {
//        return new Person("Kraken", 100, addressUkr());
//    }
}
