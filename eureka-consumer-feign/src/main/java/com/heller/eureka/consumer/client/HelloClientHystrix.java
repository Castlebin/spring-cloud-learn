package com.heller.eureka.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class HelloClientHystrix implements HelloClient {

    @Override
    public String sayHello(String name) {
        return "error, sorry, " + name;
    }

}
