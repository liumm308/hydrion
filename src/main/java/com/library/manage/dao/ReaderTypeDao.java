package com.library.manage.dao;


import com.library.manage.bean.ReaderTypeBean;

import java.util.List;
import java.util.Map;

/*
 * created by liumm308 2018/09/25
 * */
public interface ReaderTypeDao {

    List<ReaderTypeBean> queryReaderType(Map map);

    int createReaderType(ReaderTypeBean readerType);

    int updateReaderType(Map map);

    int deleteReaderType(Map map);

}
