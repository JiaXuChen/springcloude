package com.jiaxuch.model.pay;

public class PaymentInfo {
    private String payId;
    private String userId;
    private String orderId;
    private String payType;
    private double price;
    private int payStatus;
    private String payPort;

    public String getPayPort() {
        return payPort;
    }

    public void setPayPort(String payPort) {
        this.payPort = payPort;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "payId='" + payId + '\'' +
                ", userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", payType=" + payType +
                ", price=" + price +
                ", payStatus=" + payStatus +
                '}';
    }
}
