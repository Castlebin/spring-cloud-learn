package com.heller.hello.controller;

import com.heller.hello.model.entiry.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        User user = new User();
        user.setUsername(username);
        user.setId(1L);
        user.setBirthday(new Date());

        return user;
    }

}
