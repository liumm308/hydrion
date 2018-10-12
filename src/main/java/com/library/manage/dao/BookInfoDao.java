package com.library.manage.dao;


import com.library.manage.bean.BookInfoBean;

import java.util.List;
import java.util.Map;


/*
 * Created by liumm308 in 2018/09/25
 *
 * */
public interface BookInfoDao {

    List<BookInfoBean> queryBook(Map map);

    List<BookInfoBean> queryBookNumByType(Map map);

    int insertBook(BookInfoBean bookInfo);

    int deleteBook(Map map);

}
