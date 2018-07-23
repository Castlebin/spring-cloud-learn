package com.heller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("auth-service")
public interface AuthService {

    @GetMapping("/auth/authPassword")
    boolean auth(@RequestParam("name") String name, @RequestParam("password") String password);

}
