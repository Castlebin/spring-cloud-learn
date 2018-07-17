package com.heller.hello.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @ApiOperation(value = "打招呼",notes = "根据用户名，获取招呼语")
    @ApiParam(name = "name", value = "用户名", required = false)
    @GetMapping("/sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
