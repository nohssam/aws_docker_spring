package com.ict.edu;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AppController {
    @GetMapping("/hello")
    public String home() {
        return "Hello World";
    }

}