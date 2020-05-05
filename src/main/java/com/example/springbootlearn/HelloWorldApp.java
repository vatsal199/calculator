package com.example.springbootlearn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApp {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
