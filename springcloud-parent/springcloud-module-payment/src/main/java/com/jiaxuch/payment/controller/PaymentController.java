package com.jiaxuch.payment.controller;

import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.model.result.ResultModel;
import com.jiaxuch.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Autowired jiaxuch
 */
@RestController
@RequestMapping("/pay")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String payPort;

    /**
     * zookeeper当做注册中心，会将改
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return payPort + "：" + UUID.randomUUID();
    }

   @GetMapping("/query/{id}")
   public ResultModel getPaymentInfo(@PathVariable("id") String id){

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
       List<PaymentInfo> paymentInfo = paymentService.getPaymentInfo(id);
       for (PaymentInfo pay: paymentInfo) {
           pay.setPayPort(payPort);
       }
       return new ResultModel(paymentInfo);
    }

    @PostMapping("/save")
    public ResultModel<Map<String, Integer>> savePaymentInfo(@RequestBody PaymentInfo paymentInfo){
        int i = paymentService.savePaymentInfo(paymentInfo);
        Map<String, Integer> result = new HashMap<>();
        result.put("result", i);
        return new ResultModel<>(result);
    }
    @GetMapping("/delete/{id}")
    public int deletePaymentInfoByPayId(@PathVariable("id") String id){

        return paymentService.deletePaymentInfoByPayId(id);
    }
    @PostMapping("/update")
    public int updatePaymentInfoByPayId(PaymentInfo paymentInfo){
        return paymentService.updatePaymentInfoByPayId(paymentInfo);
    }



}