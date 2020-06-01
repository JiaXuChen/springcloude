package com.jiaxuch.orders.service;

import com.jiaxuch.model.result.ResultModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Component
public class PaymentInterfaceImp implements PaymentInterface{

    @Override
    @RequestMapping("/imp")
    public ResultModel getPaymentInfo(String id) {
        return  new ResultModel("0000","error", new HashMap<>());
    }
}
