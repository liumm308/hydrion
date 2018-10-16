package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface RoleInfoService {

    ResultInfo queryRole(String jsonStr);

    ResultInfo createRole(String jsonStr);

    ResultInfo updateRole(String jsonStr);

    ResultInfo deleteRole(String jsonStr);

}
