package com.heller.hello.controller.groovy

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello Groovy";
    }

}
