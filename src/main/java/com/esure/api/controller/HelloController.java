package com.esure.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping(value="hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }
    
}