package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.ReaderTypeBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.ReaderTypeDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.ReaderTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "ReaderTypeService")
public class ReaderTypeServiceImpl implements ReaderTypeService {

    private static Logger logger = LogManager.getLogger(ReaderTypeServiceImpl.class);

    @Autowired
    private IParamHandler paramHandler;

    @Autowired
    ReaderTypeDao readerTypeDao;


    @Override
    public ResultInfo queryReaderType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");
        Integer id = baseInfo.getIntValue("id");
        String typeName = baseInfo.getString("typeName");

        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
        map.put("id", id);
        map.put("typeName", typeName);

        PageInfo page = paramHandler.queryReaderType(map);
        List<ReaderTypeBean> list = page.getList();

        JSONObject jObject = new JSONObject();
        jObject.put("total", page.getTotal());
        jObject.put("pageSize", page.getPageSize());
        jObject.put("pageNum", page.getPageNum());
        jObject.put("list", list);

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("查询读者类型成功");
        resultInfo.setRetObj(jObject);

        return resultInfo;
    }

    @Override
    public ResultInfo createReaderType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        String typeName = baseInfo.getString("typeName");
        Integer maxBorrowNum = baseInfo.getIntValue("maxBorrowNum");
        Integer maxBorrowLimit = baseInfo.getIntValue("maxBorrowLimit");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        ReaderTypeBean readerType = new ReaderTypeBean();
        readerType.setId(id);
        readerType.setTypeName(typeName);
        readerType.setMaxBorrowNum(maxBorrowNum);
        readerType.setMaxBorrowLimit(maxBorrowLimit);
        readerType.setCreateTime(dateTime);
        readerType.setUpdateTime(dateTime);
        readerType.setStatus("available");

        try {

            readerTypeDao.createReaderType(readerType);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建读者类型失败");
            logger.error("创建读者类型失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建读者类型成功");
        logger.info("创建读者类型成功");
        return resultInfo;
    }

    @Override
    public ResultInfo updateReaderType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        String typeName = baseInfo.getString("typeName");
        Integer maxBorrowNum = baseInfo.getIntValue("maxBorrowNum");
        Integer maxBorrowLimit = baseInfo.getIntValue("maxBorrowLimit");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        map.put("id", id);
        map.put("typeName", typeName);
        map.put("maxBorrowNum", maxBorrowNum);
        map.put("maxBorrowLimit", maxBorrowLimit);
        map.put("updateTime", dateTime);

        try {

            readerTypeDao.updateReaderType(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("修改读者类型失败");
            logger.error("修改读者类型失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("修改读者类型成功");
        logger.info("修改读者类型成功");
        return resultInfo;
    }

    @Override
    public ResultInfo deleteReaderType(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");

        map.put("id", id);
        map.put("status", "deleted");

        try {

            readerTypeDao.deleteReaderType(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除读者类型失败");
            logger.error("删除读者类型失败: ", e);
            return resultInfo;
        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除读者类型成功");
        logger.info("删除读者类型成功");
        return resultInfo;
    }
}
