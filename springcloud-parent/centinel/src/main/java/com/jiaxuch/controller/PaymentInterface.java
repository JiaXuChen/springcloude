//package com.jiaxuch.controller;
//
//import com.jiaxuch.model.result.ResultModel;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Component
//@FeignClient(value = "springcloudalibaba-module-payment")
//@RequestMapping("/alibaba/pay")
//public interface PaymentInterface {
//
//    @GetMapping("/query/{id}")
//    ResultModel getPaymentInfo(@PathVariable("id") String id);
//
// }
