package com.heller.controller;

import com.heller.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    private AuthService authService;

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        log.info("request from " + name);

        boolean authResult = authService.auth(name, "auth_" + System.currentTimeMillis());
        log.info("get auth result: {}", authResult);

        return "Hello, " + name;
    }

}
