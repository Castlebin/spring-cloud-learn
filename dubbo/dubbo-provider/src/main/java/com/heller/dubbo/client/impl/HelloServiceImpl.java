package com.heller.dubbo.client.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.heller.dubbo.client.HelloService;

import java.util.Date;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}
