package com.jiaxuch.service;

import com.jiaxuch.model.result.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "springcloudalibaba-module-payment", fallback = SentinelService.class)
//@RequestMapping("/alibaba/pay")巨坑之一，原本以为加了这个注解可以统一省去公用部分的映射路径，实际确实可以做到，但是会导致实现这个类的时候
//报异常，无法启动，因为会认为重复提供了对外路径
public interface SentinelIntaface {

    @GetMapping("/alibaba/pay/query/{id}")
    ResultModel getPaymentInfo(@PathVariable("id") String id);

}

