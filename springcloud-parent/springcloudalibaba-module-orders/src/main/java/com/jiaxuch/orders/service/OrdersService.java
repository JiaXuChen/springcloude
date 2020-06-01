package com.jiaxuch.orders.service;

import com.jiaxuch.model.order.OrderInfo;
import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.orders.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersMapper ordesMapper;

    public  List<OrderInfo> getPaymentInfo(String id){
        return ordesMapper.getOrdersInfo(id);
    }

}
