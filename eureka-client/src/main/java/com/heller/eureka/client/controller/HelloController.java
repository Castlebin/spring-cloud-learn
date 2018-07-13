package com.heller.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(String name, HttpServletRequest request) {
        String host = request.getServerName() + request.getServerPort();
        return "Hello, " + name + ", from host:" + host;
    }

}
