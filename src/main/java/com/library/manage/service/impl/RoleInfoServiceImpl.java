package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.RoleInfoBean;
import com.library.manage.common.Constants;
import com.library.manage.common.ResultInfo;
import com.library.manage.dao.RoleInfoDao;
import com.library.manage.handler.IParamHandler;
import com.library.manage.service.RoleInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "RoleInfoService")
public class RoleInfoServiceImpl implements RoleInfoService {

    private static Logger logger = LogManager.getLogger(ReaderInfoServiceImpl.class);

    @Autowired
    IParamHandler paramHandler;

    @Autowired
    RoleInfoDao roleInfoDao;

    @Override
    public ResultInfo queryRole(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        int pageSize = baseInfo.getIntValue("pageSize");
        int pageNum = baseInfo.getIntValue("pageNum");
        Integer id = baseInfo.getIntValue("id");
        String roleId = baseInfo.getString("roleId");
        String roleName = baseInfo.getString("roleName");

        map.put("pageSize", pageSize);
        map.put("pageNum", pageNum);
        map.put("id", id);
        map.put("roleId", roleId);
        map.put("roleName", roleName);

        PageInfo page = paramHandler.queryRole(map);
        List<RoleInfoBean> list = page.getList();

        JSONObject jObject = new JSONObject();
        jObject.put("total", page.getTotal());
        jObject.put("pageSize", page.getPageSize());
        jObject.put("pageNum", page.getPageNum());
        jObject.put("list", list);

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("查询权限信息成功");
        resultInfo.setRetObj(jObject);

        return resultInfo;
    }

    @Override
    public ResultInfo createRole(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        String roleId = baseInfo.getString("roleId");
        String roleName = baseInfo.getString("roleName");
        Timestamp dateTime = new Timestamp(new Date().getTime());

        RoleInfoBean roleInfo = new RoleInfoBean();
        roleInfo.setId(id);
        roleInfo.setRoleId(roleId);
        roleInfo.setRoleName(roleName);
        roleInfo.setCreateTime(dateTime);
        roleInfo.setUpdateTime(dateTime);
        roleInfo.setStatus("available");

        try {

            roleInfoDao.createRole(roleInfo);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("创建权限信息失败");
            logger.error("创建权限信息失败: ", e);
            return resultInfo;
        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("创建权限信息成功");
        logger.info("创建权限信息成功");
        return resultInfo;
    }

    @Override
    public ResultInfo updateRole(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");
        String roleName = baseInfo.getString("roleName");

        map.put("id", id);
        map.put("roleName", roleName);

        try {

            roleInfoDao.modifyRole(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("修改权限信息失败");
            logger.error("修改权限信息失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("修改权限信息成功");
        logger.info("修改权限信息成功");
        return resultInfo;

    }

    @Override
    public ResultInfo deleteRole(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        Integer id = baseInfo.getIntValue("id");

        map.put("id", id);
        map.put("status", "deleted");

        try {

            roleInfoDao.deleteRole(map);

        } catch (Exception e) {

            resultInfo.setCode(Constants.FAIL);
            resultInfo.setInfo("删除权限信息失败");
            logger.error("删除权限信息失败: ", e);
            return resultInfo;

        }

        resultInfo.setCode(Constants.SUCCESS);
        resultInfo.setInfo("删除权限信息成功");
        logger.info("删除权限信息成功");
        return resultInfo;
    }
}
