package io.naztech.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String landing() {
        return "Landing Page...";
    }

    @GetMapping("hello/user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("hello/admin")
    public String helloAdmin() {
        return "Hello Admin";
    }
}
