package com.heller.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String greeting(String name) {
        return "Hello, " + name;
    }

}
