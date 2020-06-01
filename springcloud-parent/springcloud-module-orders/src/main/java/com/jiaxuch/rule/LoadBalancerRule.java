package com.jiaxuch.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerRule {
    @Bean
    public IRule myLoadBalancerRule(){
        return new RandomRule();
    }

}
