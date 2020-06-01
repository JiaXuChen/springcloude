package com.jiaxuch.model.result;

public class ResultModel<T> {
    private String code;
    private String msg;
    private T data;

    public ResultModel(T data) {
        this.code = "0000";
        this.msg = "成功";
        this.data = data;
    }

    public ResultModel() {
    }

    public ResultModel(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
