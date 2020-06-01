package com.jiaxuch.controller;


import com.jiaxuch.model.result.ResultModel;
import com.jiaxuch.service.SentinelIntaface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
@RefreshScope
@RestController
public class FlowLimitController {
    @Autowired
    private SentinelIntaface sentinelIntaface;
//    @Autowired
//    PaymentInterface paymentInterface;
@RequestMapping("/queryPay")
    public ResultModel queryPay(){
        return sentinelIntaface.getPaymentInfo("1");
    }
//    @RequestMapping("/queryPay")
//    public ResultModel queryPay(){
//        return paymentInterface.getPaymentInfo("1");
//    }

//    @RequestMapping("testA")
//    public Object testA(){
//        return paymentInterface.getPaymentInfo("1");
////        return "testA-------";
//    }

    @RequestMapping("testB")
    public String testB(){
        return "testB-------";
    }

    @RequestMapping("testC")
    public String testC(){
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "testC 测试RT-------";
    }

    @RequestMapping("testD")
    public String testD(){
        System.out.println("testD 异常比例测试");
        int age = 10/0;
        return "testD-------";
    }

    @RequestMapping("testE")
    public String testE(){
        System.out.println("testD 异常s数--测试");
        int age = 10/0;
        return "testD-------";
    }
//
//    @RequestMapping("testHotKey")
//    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKet")
//    public String testHotKey(
//            @RequestParam(value = "p1",required = false) String p1,
//            @RequestParam(value = "p2",required = false) String p2
//    ){
//        System.out.println("testHotKey 热点Key--测试");
//        int age = 10/0;
//        return "testHotKey-------";
//    }
//
//    public String deal_testHotKet(String p1, String p2, BlockException e) {
//        return "----deal_testHotKet,------";
//    }
}