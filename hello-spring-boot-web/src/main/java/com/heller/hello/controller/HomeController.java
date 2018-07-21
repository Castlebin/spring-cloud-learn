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

    /**
     * 并没有使用@Autowired，这里使用的构造器方式的注入，Spring容器自动查找需要的bean进行注入了
     * 这种方式不需要显式的去注解（但是使用起来不方便，推荐注解方式）
     * @param homeService
     */
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/home")
    @ResponseBody
    public String home(String name) {
        return homeService.greeting(name);
    }

}
