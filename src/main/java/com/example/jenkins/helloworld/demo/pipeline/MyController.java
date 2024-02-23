package com.example.jenkins.helloworld.demo.pipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String greet() {
        return "Hello World!";
    }
}
