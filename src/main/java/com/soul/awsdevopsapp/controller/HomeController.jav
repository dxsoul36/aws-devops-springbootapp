package com.soul.awsdevopsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to AWS DevOps Spring Boot App</h1>"
                + "<p>Status: RUNNING</p>"
                + "<p><a href='/actuator/health'>Check Health</a></p>";
    }
}
