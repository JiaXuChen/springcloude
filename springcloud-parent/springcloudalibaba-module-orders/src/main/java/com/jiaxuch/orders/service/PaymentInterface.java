package com.jiaxuch.orders.service;

import com.jiaxuch.model.result.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component(value = "paymentInterface")
@FeignClient(value = "springcloudalibaba-module-payment",fallback = PaymentInterfaceImp.class)
@RequestMapping("/alibaba/pay")
public interface PaymentInterface {

    @GetMapping("/query/{id}")
    ResultModel getPaymentInfo(@PathVariable("id") String id);

 }
