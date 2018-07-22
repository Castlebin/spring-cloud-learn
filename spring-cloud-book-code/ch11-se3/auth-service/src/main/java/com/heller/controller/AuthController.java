package com.heller.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/auth")
@RestController
public class AuthController {

    @GetMapping("/authPassword")
    public boolean auth(String name, String password) {
        log.info("auth username={}, password={}", name, password);
        return true;
    }

}
