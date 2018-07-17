package com.heller.eureka.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign已经依赖了Hystrix，只要在@FeignClient指定fallback时要使用的实现类即可
 */
@FeignClient(value = "eureka-client", fallback = HelloClientHystrix.class)
public interface HelloClient {

    @RequestMapping("/hello/sayHello")
    String sayHello(@RequestParam("name") String name);

}
