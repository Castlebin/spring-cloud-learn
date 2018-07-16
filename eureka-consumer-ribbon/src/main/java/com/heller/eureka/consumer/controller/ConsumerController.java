package com.heller.eureka.consumer.controller;

import com.heller.eureka.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name) {
        return helloService.hello(name);
    }

}
