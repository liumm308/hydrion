package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.BookTypeBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.BookTypeDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.BookTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service(value = "BookTypeService")
public class BookTypeServiceImpl implements BookTypeService {

    public static Logger logger = LogManager.getLogger(BookTypeServiceImpl.class);

    @Autowired
    private IParamHandler paramHandler;

    @Autowired
    BookTypeDao bookTypeDao;

    @Override
    public ResultInfo queryBookType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        Integer pageSize = baseInfo.getIntValue("pageSize");
        Integer pageNum = baseInfo.getIntValue("pageNum");
        String bookTypeName = baseInfo.getString("bookTypeName");

        map.put("id",id);
        map.put("bookTypeName",bookTypeName);
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);

        PageInfo page = paramHandler.queryBookType(map);
        List<BookTypeBean> list = page.getList();

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
    public ResultInfo queryBookTypeByName(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        Integer pageSize = baseInfo.getIntValue("pageSize");
        Integer pageNum = baseInfo.getIntValue("pageNum");

        map.put("id",id);
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);

        PageInfo page = paramHandler.queryBookTypeByName(map);
        List<BookTypeBean> list = page.getList();

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
    public ResultInfo createBookType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        Integer bookTypeId = baseInfo.getIntValue("bookTypeId");
        String bookTypeName = baseInfo.getString("bookTypeName");
        String bookTypeDiscipline = baseInfo.getString("bookTypeDiscipline");
        String bookTypeLocation = baseInfo.getString("bookTypeLocation");
        Timestamp dateTime = new Timestamp( new Date().getTime());

        BookTypeBean bookType = new BookTypeBean();
        bookType.setId(id);
        bookType.setBookTypeId(bookTypeId);
        bookType.setBookTypeName(bookTypeName);
        bookType.setBookTypeDiscipline(bookTypeDiscipline);
        bookType.setBookTypeLocation(bookTypeLocation);
        bookType.setCreateTime(dateTime);
        bookType.setUpdateTime(dateTime);
        bookType.setStatus("available");

        try{

            bookTypeDao.createBookType(bookType);

        }catch(Exception e){

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建书本类型失败");
            logger.error("创建书本类型失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建书本类型成功");
        logger.info("创建书本类型成功");
        return resultInfo;
    }

    @Override
    public ResultInfo updateBookType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        String bookTypeName = baseInfo.getString("bookTypeName");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        map.put("id",id);
        map.put("bookTypeName",bookTypeName);
        map.put("updateTime",dateTime);

        try{

            bookTypeDao.updateBookType(map);

        }catch(Exception e){

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("修改书本类型失败");
            logger.error("修改书本类型失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("修改书本类型成功");
        logger.info("修改书本类型成功");
        return resultInfo;
    }

    @Override
    public ResultInfo deleteBookType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");

        map.put("id",id);
        map.put("status","deleted");

        try{

            bookTypeDao.deleteBookType(map);

        }catch(Exception e){

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除书本类型失败");
            logger.error("删除书本类型失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除书本类型成功");
        logger.info("删除书本类型成功");
        return resultInfo;

    }
}
