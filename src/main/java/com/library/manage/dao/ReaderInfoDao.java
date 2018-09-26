package com.library.manage.dao;


import com.library.manage.bean.ReaderInfoBean;

import java.util.List;
import java.util.Map;

/*
 * created by liumm308 2018/09/25
 * */
public interface ReaderInfoDao {
    List<ReaderInfoBean> queryReader(Map map);

    int createReader(ReaderInfoBean readerInfo);

    int modifyReader(Map map);

    int deleteReader(Map map);
}
