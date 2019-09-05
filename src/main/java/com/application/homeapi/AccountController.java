package com.application.homeapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    @RequestMapping("/home")
    public String accountController() {
        return "Hello this is the home application 1";
    }
}
