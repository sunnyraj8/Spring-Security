package com.example.spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String  printSomething(){
        return "Hello World!...";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String  printUser(){
        return "Hello User!...";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String  printAdmin(){
        return "Hello Admin!...";
    }
}
