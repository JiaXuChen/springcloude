package com.jiaxuch.payment.service;

import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.payment.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    public  List<PaymentInfo> getPaymentInfo(String id){

        return paymentMapper.getPaymentInfo(id);
    }


}
