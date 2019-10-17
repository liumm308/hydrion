package com.library.manage.bean;

import java.io.Serializable;
import java.sql.Timestamp;


/*
 * Created by liumm308 in 2018/09/26
 *
 * */
public class BookInfoBean implements Serializable {

    private Integer id;
    private String isbn;
    private Integer typeId;
    private String bookTypeName;
    private Integer numTypeOfBooks;
    private String bookTypeDisciplineId;
    private String bookTypeDiscipline;
    private Integer publishNum;
    private Double unitPrice;
    private String bookName;
    private String author;
    private String publish;
    private String status;
    private Timestamp publishDate;
    private Timestamp upTime;
    private Timestamp downTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public Integer getNumTypeOfBooks() {
        return numTypeOfBooks;
    }

    public void setNumTypeOfBooks(Integer numTypeOfBooks) {
        this.numTypeOfBooks = numTypeOfBooks;
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

    public Integer getPublishNum() {
        return publishNum;
    }

    public void setPublishNum(Integer publishNum) {
        this.publishNum = publishNum;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    public Timestamp getUpTime() {
        return upTime;
    }

    public void setUpTime(Timestamp upTime) {
        this.upTime = upTime;
    }

    public Timestamp getDownTime() {
        return downTime;
    }

    public void setDownTime(Timestamp downTime) {
        this.downTime = downTime;
    }


}
