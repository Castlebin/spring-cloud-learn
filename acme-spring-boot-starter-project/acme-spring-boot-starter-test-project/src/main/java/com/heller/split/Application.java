package com.heller.split;

import com.heller.acme.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @Autowired
    DataSourceService dataSourceService;

    @GetMapping("/get/driver")
    public String getDriver() {
        return dataSourceService.getDriver();
    }

    @GetMapping("/get/url")
    public String getUrl() {
        return dataSourceService.getUrl();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
