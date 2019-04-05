package com.library.manage.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/*
 * Created by liumm308 in 2018/09/25
 *
 * */
public class ReaderInfoBean implements Serializable {

    private Integer id;
    private String readerName;
    private String readerType;
    private Integer readerAge;
    private String readerSex;
    private String readerPhone;
    private String descriptive;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderType() {
        return readerType;
    }

    public void setReaderType(String readerType) {
        this.readerType = readerType;
    }

    public Integer getReaderAge() {
        return readerAge;
    }

    public void setReaderAge(Integer readerAge) {
        this.readerAge = readerAge;
    }

    public String getReaderSex() {
        return readerSex;
    }

    public void setReaderSex(String readerSex) {
        this.readerSex = readerSex;
    }

    public String getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(String readerPhone) {
        this.readerPhone = readerPhone;
    }

    public String getDescriptive() {
        return descriptive;
    }

    public void setDescriptive(String descriptive) {
        this.descriptive = descriptive;
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

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
