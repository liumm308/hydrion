package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.ReaderInfoBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.ReaderInfoDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.ReaderInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * created by liumm308 2018/09/25
 * */
@Service(value = "ReaderInfoService")
public class ReaderInfoServiceImpl implements ReaderInfoService {

    private static Logger logger = LogManager.getLogger(ReaderInfoServiceImpl.class);

    @Autowired
    private IParamHandler paramHandler;

    @Autowired
    ReaderInfoDao readerInfoDao;

    @Override
    public ResultInfo queryReader(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");
        int id = baseInfo.getIntValue("id");
        int readerAge = baseInfo.getIntValue("readerAge");
        String readerName = baseInfo.getString("readerName");
        String readerType = baseInfo.getString("readerType");
        String readerSex = baseInfo.getString("readerSex");
        String bookQuotaForReader = baseInfo.getString("bookQuotaForReader");
        String bookNumForReader = baseInfo.getString("bookNumForReader");

        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
        map.put("id", id);
        map.put("readerName", readerName);
        map.put("readerType", readerType);
        map.put("readerAge", readerAge);
        map.put("readerSex", readerSex);
        map.put("bookQuota", bookQuotaForReader);
        map.put("bookNum", bookNumForReader);

        PageInfo page = paramHandler.queryReader(map);
        List<ReaderInfoBean> list = page.getList();

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
    public ResultInfo createReader(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");
        int readerAge = baseInfo.getIntValue("readerAge");
        String readerName = baseInfo.getString("readerName");
        String readerType = baseInfo.getString("readerType");
        String readerSex = baseInfo.getString("readerSex");
        String readerPhone = baseInfo.getString("readerPhone");
        String descriptive = baseInfo.getString("descriptive");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        ReaderInfoBean readerInfo = new ReaderInfoBean();
        readerInfo.setId(id);
        readerInfo.setReaderAge(readerAge);
        readerInfo.setReaderName(readerName);
        readerInfo.setReaderType(readerType);
        readerInfo.setReaderSex(readerSex);
        readerInfo.setReaderPhone(readerPhone);
        readerInfo.setDescriptive(descriptive);
        readerInfo.setCreateTime(dateTime);
        readerInfo.setUpdateTime(dateTime);
        readerInfo.setStatus("available");

        try {

            readerInfoDao.createReader(readerInfo);

        } catch (Exception e) {
            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建读者失败");
            logger.error("创建读者失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建读者成功");
        return resultInfo;

    }

    @Override
    public ResultInfo modifyReader(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getInteger("id");
        String readerName = baseInfo.getString("readerName");
        String readerType = baseInfo.getString("readerType");
        String readerPhone = baseInfo.getString("readerPhone");
        String descriptive = baseInfo.getString("descriptive");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        map.put("id", id);
        map.put("readerName", readerName);
        map.put("readerType", readerType);
        map.put("readerPhone", readerPhone);
        map.put("descriptive", descriptive);
        map.put("updateTime", dateTime);

        try {

            readerInfoDao.modifyReader(map);

        } catch (Exception e) {
            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建读者失败");
            logger.error("创建读者失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建读者成功");
        return resultInfo;

    }

    @Override
    public ResultInfo deleteReader(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getInteger("id");

        map.put("id", id);
        map.put("status", "deleted");

        try {

            readerInfoDao.deleteReader(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除读者失败");
            logger.error("删除读者失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除读者成功");
        return resultInfo;
    }
}
