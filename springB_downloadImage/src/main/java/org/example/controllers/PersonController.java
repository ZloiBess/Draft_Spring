package org.example.controllers;

import org.example.model.Person;
import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("people", personService.index());
        return "person/index";
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("person", new Person());
        return "person/new";
    }

    @PostMapping
    public String save(@ModelAttribute Person person,
                       @RequestParam("file")MultipartFile multipartFile){
        personService.save(person, multipartFile);
        return "redirect:/people";
    }
}
