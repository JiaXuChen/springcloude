package com.jiaxuch.model.order;

import com.jiaxuch.model.pay.PaymentInfo;

public class OrderInfo {
    private String orderId;
    private String userId;
    private String productId;
    private String payId;
    private int unit;
    private double actualPrice;
    private double orginPrice;
    private PaymentInfo paymentInfo;
    private String orderPort;

    public String getOrderPort() {
        return orderPort;
    }

    public void setOrderPort(String orderPort) {
        this.orderPort = orderPort;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public double getOrginPrice() {
        return orginPrice;
    }

    public void setOrginPrice(double orginPrice) {
        this.orginPrice = orginPrice;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                ", payId='" + payId + '\'' +
                ", unit=" + unit +
                ", actualPrice=" + actualPrice +
                ", orginPrice=" + orginPrice +
                ", paymentInfo=" + paymentInfo +
                '}';
    }
}
