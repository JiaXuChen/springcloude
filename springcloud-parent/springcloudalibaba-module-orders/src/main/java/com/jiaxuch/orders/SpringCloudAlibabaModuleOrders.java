package com.jiaxuch.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jiaxuch
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@RibbonClient(name = "springcloudalibaba-module-payment", configuration = LoadBalancerRule.class)
public class SpringCloudAlibabaModuleOrders {
    public static void main(String[] args) {
      SpringApplication.run(SpringCloudAlibabaModuleOrders.class, args);
    }
}
