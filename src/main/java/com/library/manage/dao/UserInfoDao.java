package com.library.manage.dao;

import com.library.manage.bean.UserInfoBean;

import java.util.List;
import java.util.Map;

/*
 * created by liumm308 2018/09/19
 * */
public interface UserInfoDao {

    List<UserInfoBean> queryUser(Map map);

    int createUser(UserInfoBean user);

    int removeUser(Map map);

    int modifyUser(Map map);

}