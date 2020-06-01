package com.jiaxuch.orders.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.jiaxuch.model.order.OrderInfo;
import com.jiaxuch.model.pay.PaymentInfo;
import com.jiaxuch.model.result.ResultModel;
import com.jiaxuch.orders.service.OrdersService;
import com.jiaxuch.orders.service.PaymentInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Autowired jiaxuch
 */
@RestController
@RequestMapping
@RefreshScope
public class OrdersFeignController {
    public final static Logger LOGGER = LoggerFactory.getLogger(OrdersFeignController.class);
    @Autowired
    private OrdersService ordersService;

    @Resource
    private PaymentInterface paymentInterface;

    @Value("${server.port}")
    private String orderPort;

   @GetMapping("/query/{id}")
   public ResultModel getPaymentInfo(@PathVariable("id") String id){
       List<OrderInfo> info = ordersService.getPaymentInfo(id);
       for (OrderInfo orderInfo : info) {
           String payId = orderInfo.getPayId();
           orderInfo.setOrderPort(orderPort);
            //查询支付系统//坑zookeeper做服务中心区分大小写，eureka不区分
           ResultModel forObject = paymentInterface.getPaymentInfo(payId);
           Object data = forObject.getData();
           if(data !=null ){
               LOGGER.info(JSON.toJSONString(data));
               JSONArray jsonArray = JSON.parseArray(JSON.toJSONString(data));
               if(jsonArray.size() > 0){
                   PaymentInfo paymentInfo = jsonArray.getJSONObject(0).toJavaObject(PaymentInfo.class);
                   orderInfo.setPaymentInfo(paymentInfo);
               }
           }

       }
       return new ResultModel(info);
    }

}