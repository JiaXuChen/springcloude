package com.jiaxuch.payment.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.model.result.ResultModel;
import com.jiaxuch.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Autowired jiaxuch
 */
@RestController
@RequestMapping("/pay")
@RefreshScope
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String payPort;

    @SentinelResource("getPaymentInfo")
   @GetMapping("/query/{id}")
   public ResultModel getPaymentInfo(@PathVariable("id") String id){

       List<PaymentInfo> paymentInfo = paymentService.getPaymentInfo(id);
       for (PaymentInfo pay: paymentInfo) {
           pay.setPayPort(payPort);
       }
       return new ResultModel(paymentInfo);
    }
}