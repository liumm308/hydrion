package com.library.manage.dao;

import com.library.manage.bean.UserRoleBean;

import java.util.List;
import java.util.Map;

public interface UserRoleDao {

    List<UserRoleBean> queryRoleByUser(Map map);

    int tyingRoleByUser(UserRoleBean userRole);

    int updateRoleByUser(Map map);

    int untyingRoleByUser(Map map);

}
