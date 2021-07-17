package com.example.apollospringboottest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloTestController {

    @Value("${timeout}")
    private String timeout;


    @GetMapping("/test")
    public String test(){
        return timeout+"-----";
    }

}
