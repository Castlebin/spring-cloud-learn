package com.heller.controller;

import com.heller.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return greetingService.greet();
    }

}
