package com.application.homeapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    @RequestMapping("/home")
    public String simpleGreeting() {
        System.out.println("Home API Has been Hit*********");
        return "Hello this is the home application 1";
    }

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "Hello " + name + " welcome to your home page";
    }
}
