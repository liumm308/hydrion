package com.library.manage.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.UserInfoBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.UserInfoDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.UserInfoService;
import com.library.manage.utils.MD5Util;
import com.library.manage.utils.RandomUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    private static Logger logger = LogManager.getLogger(UserInfoServiceImpl.class);

    @Autowired
    private IParamHandler paramHandler;

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private RandomUtils randomUtils;

    @Override
    public ResultInfo queryUser(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSON.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");
        int id = baseInfo.getIntValue("id");
        String userId = baseInfo.getString("userId");
        String userName = baseInfo.getString("userName");
        String userPassword = baseInfo.getString("userPassword");

        map.put("id", id);
        map.put("userId", userId);
        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
        map.put("userName", userName);
        map.put("userPassword", userPassword);

        PageInfo page = paramHandler.queryUser(map);
        List<UserInfoBean> list = page.getList();

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
    public ResultInfo insertUser(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");
        String userName = baseInfo.getString("userName");
        String userPassword = baseInfo.getString("userPassword");
        String md5Password = MD5Util.encode(userPassword);
        String userCompany = baseInfo.getString("userCompany");
        String type = baseInfo.getString("type");
        String userId = randomUtils.toFixedLengthStringByUUID(32);
        Timestamp dateTime = new Timestamp(new Date().getTime());

        UserInfoBean userInfo = new UserInfoBean();
        userInfo.setId(id);
        userInfo.setUserId(userId);
        userInfo.setUserName(userName);
        userInfo.setUserPassword(md5Password);
        userInfo.setUserCompany(userCompany);
        userInfo.setType(type);
        userInfo.setCreateTime(dateTime);
        userInfo.setUpdateTime(dateTime);
        userInfo.setStatus("available");

        try {
            userInfoDao.createUser(userInfo);
        } catch (Exception e) {
            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建用户失败");
            logger.error("创建用户失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建用户成功");
        return resultInfo;
    }

    @Override
    public ResultInfo removeUser(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");

        map.put("id", id);
        map.put("status", "deleted");

        try {

            userInfoDao.removeUser(map);

        } catch (Exception e) {
            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除用户失败");
            logger.error("删除用户失败", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除用户成功");
        return resultInfo;
    }

    @Override
    public ResultInfo modifyUser(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int id = baseInfo.getIntValue("id");
        String userName = baseInfo.getString("userName");
        String userPassword = baseInfo.getString("userPassword");

        map.put("id", id);
        map.put("userName", userName);
        map.put("userPassword", userPassword);
        Timestamp dateTime = new Timestamp(new Date().getTime());

        try {

            userInfoDao.modifyUser(map);

        } catch (Exception e) {
            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("修改用户失败");
            logger.error("修改用户失败", e);
            return resultInfo;

        }
        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("修改用户成功");
        return resultInfo;
    }

    @Override
    public UserInfoBean queryUserByUserName(String username) {

        Map<String, Object> map = new HashMap<>();

        map.put("userName", username);

        try {

            return userInfoDao.queryUserByUserName(map);


        } catch (Exception e) {

            logger.error("通过" + "username" + " 查询用户失败", e);
            return null;

        }

    }
}
