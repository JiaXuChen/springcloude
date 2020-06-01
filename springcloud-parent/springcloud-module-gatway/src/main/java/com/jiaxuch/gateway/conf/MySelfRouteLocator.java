package com.jiaxuch.gateway.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRouteLocator {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("baidu_ceshi", fn ->fn.path("/tab/*").uri("https://haokan.baidu.com")).build();
        return routes.build();
    }

}
