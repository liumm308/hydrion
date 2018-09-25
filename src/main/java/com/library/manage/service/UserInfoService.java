package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface UserInfoService {
    ResultInfo queryUser(String jsonStr);

    ResultInfo insertUser(String jsonStr);

    ResultInfo removeUser(String jsonStr);

    ResultInfo modifyUser(String jsonStr);


}
