package com.jiaxuch.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jiaxuch
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
//@RibbonClient(name = "springcloud-module-payment", configuration = LoadBalancerRule.class)
public class SpringCloudModuleOrders {
    public static void main(String[] args) {
      SpringApplication.run(SpringCloudModuleOrders.class, args);
    }
}
