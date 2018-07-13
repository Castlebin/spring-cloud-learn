package com.heller.eureka.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface HelloClient {

    @RequestMapping("/hello/sayHello")
    String sayHello(@RequestParam("name") String name);

}
