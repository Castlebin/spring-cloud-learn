package com.heller.eureka.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(String name) {
        String url = "http://eureka-client/hello/sayHello";
        return restTemplate.getForObject(url+"?name={0}", String.class, name);
    }

    public String helloFallback(String name) {
        return "error, " + name + " from fallback";
    }

}
