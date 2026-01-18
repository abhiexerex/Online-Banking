package com.example.onlinebanking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "JWT WORKING";
    }
}
