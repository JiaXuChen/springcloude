package com.jiaxuch.service;

import com.jiaxuch.model.result.ResultModel;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class SentinelService  implements SentinelIntaface{

    @Override
    public ResultModel getPaymentInfo(String id){
        return new ResultModel("4444","服务降级返回---PaymentFallbackService", new HashMap());
    }
}