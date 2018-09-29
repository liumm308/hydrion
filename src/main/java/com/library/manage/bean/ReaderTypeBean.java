package com.library.manage.bean;

import java.sql.Timestamp;

/*
 * Created by liumm308 in 2018/09/29
 *
 * */
public class ReaderTypeBean {

    private Integer id;
    private String typeName;
    private Integer maxBorrowNum;
    private Integer maxBorrowLimit;
    private String status;
    private Timestamp createTime;
    private Timestamp updatetrTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getMaxBorrowNum() {
        return maxBorrowNum;
    }

    public void setMaxBorrowNum(Integer maxBorrowNum) {
        this.maxBorrowNum = maxBorrowNum;
    }

    public Integer getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    public void setMaxBorrowLimit(Integer maxBorrowLimit) {
        this.maxBorrowLimit = maxBorrowLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdatetrTime() {
        return updatetrTime;
    }

    public void setUpdatetrTime(Timestamp updatetrTime) {
        this.updatetrTime = updatetrTime;
    }
}
