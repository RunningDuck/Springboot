package com.admin.model;

public class JsonResult<T> {

    private StatusCode status;

    //提示信息
    private String msg;

    public T data;

    public StatusCode getStatus() {
        return status;
    }

    public void setStatus(StatusCode status) {
        this.status = status;
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

    public JsonResult() {
    }

    public JsonResult(StatusCode status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public JsonResult(StatusCode status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
