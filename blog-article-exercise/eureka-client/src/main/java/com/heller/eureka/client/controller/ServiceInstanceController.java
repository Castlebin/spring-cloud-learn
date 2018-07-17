package com.heller.eureka.client.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/service-instances")
@RestController
public class ServiceInstanceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @ApiOperation("获取ServiceInstance列表")
    @ApiImplicitParam(name = "applicationName", value = "应用名", defaultValue = "eureka-client", required = true)
    @RequestMapping(value = "/{applicationName}", method = RequestMethod.GET)
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }

    @ApiOperation("获取Service名字列表")
    @GetMapping("/")
    public List<String> getServices() {
        return discoveryClient.getServices();
    }

}
