package com.heller.hello.controller;

import com.heller.hello.entity.User;
import com.heller.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{username}")
    public User getUser(@PathVariable String username) {
        return userService.findByUsername(username);
    }

}
