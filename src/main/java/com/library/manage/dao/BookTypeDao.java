package com.library.manage.dao;

import com.library.manage.bean.BookTypeBean;

import java.util.List;
import java.util.Map;

public interface BookTypeDao {

    List<BookTypeBean> queryBookType(Map map);

    int createBookType(BookTypeBean bookType);

    int updateBookType(Map map);

    int deleteBookType(Map map);
}
