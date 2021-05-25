package com.meidi.test.springboot0525.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hi")
    public String hello(){
        return "asdddd";
    }
}
