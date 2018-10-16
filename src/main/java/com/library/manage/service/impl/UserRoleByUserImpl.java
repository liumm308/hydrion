package com.library.manage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.library.manage.common.ResultInfo;
import com.library.manage.service.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service(value = "UserRoleService")
public class UserRoleByUserImpl implements UserRoleService {
    @Override
    public ResultInfo queryRoleByUser(String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        JSONObject baseInfo = jsonObject.getJSONObject("baseInfo");
        String userId = baseInfo.getString("userId");

        return null;
    }

    @Override
    public ResultInfo tyingRoleByUser(String jsonStr) {
        return null;
    }

    @Override
    public ResultInfo updateRoleByUser(String jsonStr) {
        return null;
    }

    @Override
    public ResultInfo untyingRoleByUser(String jsonStr) {
        return null;
    }
}
