package com.heller.hello.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heller.hello.model.entiry.User;
import com.heller.hello.util.SpringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(String name) {
        log.info("获取Spring上下文：{}", SpringUtil.getApplicationContext());
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
