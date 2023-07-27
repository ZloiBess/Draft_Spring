package org.example.controllers;

import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

@RestController
@RequestMapping("/image")
public class ImageRestController {

    private PersonService personService;

    @Autowired
    public ImageRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getImage(@PathVariable Long id){
        return ResponseEntity.ok()
                .body(new InputStreamResource(
                        new ByteArrayInputStream(
                                personService.getById(id).getImage())
                        ));
    }

}
