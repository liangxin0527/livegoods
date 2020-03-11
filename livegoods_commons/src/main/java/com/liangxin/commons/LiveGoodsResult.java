package com.liangxin.commons;

import java.util.HashMap;

public class LiveGoodsResult extends HashMap<String, Object> {
    // 返回状态值
    private int status;
    // 服务端返回数据
    private Object data;
    // 服务端返回消息
    private String msg;

    public int getStatus() {
        return this.get("status") == null ? 0 : Integer.parseInt(this.get("status").toString());
    }

    public void setStatus(int status) {
        this.put("status", status);
    }

    public Object getData() {

        return this.get("data");
    }

    public void setData(Object data) {
        this.put("data", data);
    }

    public String getMsg() {
        return this.get("status") == null ? "" : this.get("msg").toString();
    }

    public void setMsg(String msg) {
        this.put("msg", msg);
    }
}

