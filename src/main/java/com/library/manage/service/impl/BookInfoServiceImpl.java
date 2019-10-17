package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.BookInfoBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.BookInfoDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.BookInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "BookInfoService")
public class BookInfoServiceImpl implements BookInfoService {

    private static Logger logger = LogManager.getLogger(ReaderInfoServiceImpl.class);

    @Autowired
    private IParamHandler paramHandler;

    @Autowired
    BookInfoDao bookInfoDao;

    @Override
    public ResultInfo queryBook(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");
        int typeId = baseInfo.getIntValue("typeId");
        String isbn = baseInfo.getString("isbn");
        String bookName = baseInfo.getString("bookName");
        String author = baseInfo.getString("author");
        String publish = baseInfo.getString("publish");

        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
        map.put("typeId", typeId);
        map.put("isbn", isbn);
        map.put("bookName", bookName);
        map.put("author", author);
        map.put("publish", publish);

        PageInfo page = paramHandler.queryBook(map);
        List<BookInfoBean> list = page.getList();

        JSONObject jObject = new JSONObject();
        jObject.put("total", page.getTotal());
        jObject.put("pageSize", page.getPageSize());
        jObject.put("pageNum", page.getPageNum());
        jObject.put("list", list);

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setRetObj(jObject);
        return resultInfo;

    }

    @Override
    public ResultInfo queryBookNumByType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");

        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);

        PageInfo page = paramHandler.queryBookNumByType(map);
        List<BookInfoBean> list = page.getList();

        JSONObject jObject = new JSONObject();
        jObject.put("total", page.getTotal());
        jObject.put("pageSize", page.getPageSize());
        jObject.put("pageNum", page.getPageNum());
        jObject.put("list", list);

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setRetObj(jObject);
        return resultInfo;
    }

    @Override
    public ResultInfo insertBook(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");
        String isbn = baseInfo.getString("isbn");
        int typeId = baseInfo.getIntValue("typeId");
        int publishNum = baseInfo.getIntValue("publishNum");
        String bookTypeDisciplineId = baseInfo.getString("bookTypeDisciplineId");
        Double unitPrice = baseInfo.getDouble("unitPrice");
        String bookName = baseInfo.getString("bookName");
        String author = baseInfo.getString("author");
        String publish = baseInfo.getString("publish");
        Timestamp publishDate = baseInfo.getTimestamp("publishDate");
        Timestamp upTime = baseInfo.getTimestamp("upTime");
        Timestamp downTime = baseInfo.getTimestamp("downTime");

        BookInfoBean bookInfo = new BookInfoBean();
        bookInfo.setId(id);
        bookInfo.setIsbn(isbn);
        bookInfo.setBookName(bookName);
        bookInfo.setAuthor(author);
        bookInfo.setPublish(publish);
        bookInfo.setTypeId(typeId);
        bookInfo.setBookTypeDisciplineId(bookTypeDisciplineId);
        bookInfo.setUnitPrice(unitPrice);
        bookInfo.setPublishNum(publishNum);
        bookInfo.setPublishDate(publishDate);
        bookInfo.setUpTime(upTime);
        bookInfo.setDownTime(downTime);
        bookInfo.setStatus("available");

        try {

            bookInfoDao.insertBook(bookInfo);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("录入书本信息失败");
            logger.error("录入书本信息失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("录入书本信息成功");
        logger.info("录入书本信息成功");
        return resultInfo;

    }

    @Override
    public ResultInfo deleteBook(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");

        map.put("id", id);
        map.put("status", "deleted");

        try {

            bookInfoDao.deleteBook(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除书本信息失败");
            logger.error("删除书本信息失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除书本信息成功");
        logger.info("删除书本信息成功");
        return resultInfo;
    }
}
