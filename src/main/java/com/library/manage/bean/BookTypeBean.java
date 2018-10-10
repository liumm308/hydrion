package com.library.manage.bean;

import java.sql.Timestamp;

public class BookTypeBean {

    private Integer id;
    private String bookTypeName;
    private String bookTypeDiscipline;
    private String bookTypeLocation;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTypeDiscipline() {
        return bookTypeDiscipline;
    }

    public void setBookTypeDiscipline(String bookTypeDiscipline) {
        this.bookTypeDiscipline = bookTypeDiscipline;
    }

    public String getBookTypeLocation() {
        return bookTypeLocation;
    }

    public void setBookTypeLocation(String bookTypeLocation) {
        this.bookTypeLocation = bookTypeLocation;
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
