package com.jiaxuch.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServerInfo {

    @Autowired
    DiscoveryClient discoveryClient;



    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("service" + service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-module-payment");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId());
            System.out.println(instance.getHost());
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
        }

        return discoveryClient;

    }

}
