package com.prasanta.hello.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String homeController() {
        return "HomePage: Application is running............";
    }

    @GetMapping("/print-name")
    public String printHelloWorld() {
        return "Prasanta Kumar Parida";
    }
}
