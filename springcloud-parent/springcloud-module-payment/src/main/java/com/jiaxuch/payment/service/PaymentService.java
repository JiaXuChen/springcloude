package com.jiaxuch.payment.service;

import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.payment.mapper.PaymentMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @HystrixCommand(fallbackMethod = "returnNull", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public  List<PaymentInfo> getPaymentInfo(String id){

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return paymentMapper.getPaymentInfo(id);
    }

    public List<PaymentInfo> returnNull(String id){
         List<PaymentInfo> result = new ArrayList<>();
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setPrice(999999);
        result.add(paymentInfo);
        return result;
    }
    public  int savePaymentInfo(PaymentInfo paymentInfo){
        return paymentMapper.savePaymentInfo(paymentInfo);
    }

    public int deletePaymentInfoByPayId(String id){
        return paymentMapper.deletePaymentInfoByPayId(id);
    }

    public int updatePaymentInfoByPayId(PaymentInfo paymentInfo){
        return paymentMapper.updatePaymentInfoByPayId(paymentInfo);
    }
}
