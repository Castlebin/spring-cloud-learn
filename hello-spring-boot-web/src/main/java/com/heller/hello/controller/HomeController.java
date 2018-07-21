package com.heller.hello.controller;

import com.heller.hello.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 一个更符合现实场景中的web应用场景，有service层
 */
@Controller
public class HomeController {

    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/home")
    @ResponseBody
    public String home(String name) {
        return homeService.greeting(name);
    }

}
