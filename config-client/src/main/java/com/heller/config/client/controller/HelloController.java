package com.heller.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Value("${info.profile}")
    private String profile;

    @RequestMapping("/profile")
    public String getProfile() {
        return profile;
    }

}
