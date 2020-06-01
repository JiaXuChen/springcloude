package com.jiaxuch.orders.service;

import com.jiaxuch.model.result.ResultModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Component
public class PaymentFailBackinterface implements PaymentInterface {
    @Override
    @GetMapping("/error/query/")
    public ResultModel getPaymentInfo(String id) {
        return  new ResultModel("9999","异常了",new ArrayList<>());
    }
}
