package com.heller.eureka.client.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @ApiOperation(value = "打招呼", notes = "根据用户昵称，返回招呼语")
    @RequestMapping(value = "/sayHello", method = {RequestMethod.GET, RequestMethod.POST})
    public String sayHello(String name, HttpServletRequest request) {
        String host = request.getServerName() + ":" + request.getServerPort();
        return "Hello, " + name + ", from host: " + host;
    }

}
