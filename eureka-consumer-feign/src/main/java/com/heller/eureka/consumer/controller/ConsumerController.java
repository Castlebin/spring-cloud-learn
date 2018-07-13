package com.heller.eureka.consumer.controller;

import com.heller.eureka.consumer.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping
    public String consumer(String name) {
        return helloClient.sayHello(name);
    }

}
