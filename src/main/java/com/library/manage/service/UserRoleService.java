package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface UserRoleService {

    ResultInfo queryRoleByUser(String jsonStr);

    ResultInfo tyingRoleByUser(String jsonStr);

    ResultInfo updateRoleByUser(String jsonStr);

    ResultInfo untyingRoleByUser(String jsonStr);

}
