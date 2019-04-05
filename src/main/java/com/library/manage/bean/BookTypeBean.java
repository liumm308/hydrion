package com.library.manage.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class BookTypeBean implements Serializable {

    private Integer id;
    private Integer bookTypeId;
    private String bookTypeName;
    private String bookTypeDisciplineId;
    private String bookTypeDiscipline;
    private String bookTypeLocation;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
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

    public String getBookTypeDisciplineId() {
        return bookTypeDisciplineId;
    }

    public void setBookTypeDisciplineId(String bookTypeDisciplineId) {
        this.bookTypeDisciplineId = bookTypeDisciplineId;
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
