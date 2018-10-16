package com.library.manage.dao;


import com.library.manage.bean.RoleInfoBean;

import java.util.List;
import java.util.Map;

/*
 * Created by liumm308 in 2018/10/15
 *
 * */
public interface RoleInfoDao {

    List<RoleInfoBean> queryRole(Map map);

    int createRole(RoleInfoBean roleInfo);

    int modifyRole(Map map);

    int deleteRole(Map map);
}
