package com.heller.eureka.client.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
