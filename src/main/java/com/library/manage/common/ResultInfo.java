package com.library.manage.common;

import java.io.Serializable;

public class ResultInfo implements Serializable {
    private static final long serialVersionUID = -8137872469826037979L;
    public int code = -1;
    public String info = "";
    public Object retObj;
    public String msg;
    private String tradeId;
    private Object data;

    public ResultInfo() {
    }

    public ResultInfo(int code, String info, Object retObj) {
        this.code = code;
        this.info = info;
        this.retObj = retObj;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getRetObj() {
        return this.retObj;
    }

    public void setRetObj(Object retObj) {
        this.retObj = retObj;
    }

    public boolean IsSuccss() {
        return this.code == 0;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
