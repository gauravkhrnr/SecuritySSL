package com.example.demo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("admin")
    @Secured("ROLE_ADMIN")
    public String apiAdmin() {
        return "ADMIN hereeeee!";
    }

    @GetMapping("user")
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public String apiUser() {
        return "This is a User";
    }
}
