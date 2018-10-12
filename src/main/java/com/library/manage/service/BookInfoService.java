package com.library.manage.service;

import com.library.manage.common.ResultInfo;


/*
 * Created by liumm308 in 2018/09/26
 *
 * */
public interface BookInfoService {

    ResultInfo queryBook(String jsonStr);

    ResultInfo queryBookNumByType(String jsonStr);

    ResultInfo insertBook(String jsonStr);

    ResultInfo deleteBook(String jsonStr);

}
