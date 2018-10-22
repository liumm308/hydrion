package com.library.manage.service;

import com.library.manage.bean.UserInfoBean;
import com.library.manage.common.ResultInfo;

import java.util.List;

public interface UserInfoService {
    ResultInfo queryUser(String jsonStr);

    ResultInfo insertUser(String jsonStr);

    ResultInfo removeUser(String jsonStr);

    ResultInfo modifyUser(String jsonStr);

    UserInfoBean queryUserByUserName(String username);

}
