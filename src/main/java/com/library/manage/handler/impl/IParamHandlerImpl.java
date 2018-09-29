package com.library.manage.handler.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.library.manage.bean.BookInfoBean;
import com.library.manage.bean.ReaderInfoBean;
import com.library.manage.bean.ReaderTypeBean;
import com.library.manage.bean.UserInfoBean;
import com.library.manage.dao.BookInfoDao;
import com.library.manage.dao.ReaderInfoDao;
import com.library.manage.dao.ReaderTypeDao;
import com.library.manage.dao.UserInfoDao;
import com.library.manage.handler.IParamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("paramHandler")
public class IParamHandlerImpl implements IParamHandler {

    @Autowired
    UserInfoDao userInfoDao;

    @Autowired
    ReaderInfoDao readerInfoDao;

    @Autowired
    BookInfoDao bookInfoDao;

    @Autowired
    ReaderTypeDao readerTypeDao;

    /**
     * 查询用户
     */
    @Override
    public PageInfo queryUser(Map<String, Object> map) {
        Integer pageNum = Integer.valueOf((Integer) map.get("pageNum"));
        Integer pageSize = Integer.valueOf((Integer) map.get("pageSize"));

        if ((null == pageNum || pageNum == 0) && (null == pageSize || pageSize == 0)) {

            List<UserInfoBean> list = userInfoDao.queryUser(map);
            PageInfo<UserInfoBean> page = new PageInfo<UserInfoBean>(list);
            page.setList(list);
            return page;

        } else {

            PageHelper.startPage(pageNum, pageSize);
            List<UserInfoBean> list = userInfoDao.queryUser(map);
            PageInfo<UserInfoBean> page = new PageInfo<UserInfoBean>(list);
            return page;
        }
    }

    /**
     * 查询读者
     */
    @Override
    public PageInfo queryReader(Map<String, Object> map) {
        Integer pageNum = Integer.valueOf((Integer) map.get("pageNum"));
        Integer pageSize = Integer.valueOf((Integer) map.get("pageSize"));

        if ((null == pageNum || pageNum == 0) && (null == pageSize || pageSize == 0)) {

            List<ReaderInfoBean> list = readerInfoDao.queryReader(map);
            PageInfo<ReaderInfoBean> page = new PageInfo<ReaderInfoBean>(list);
            page.setList(list);
            return page;

        } else {

            PageHelper.startPage(pageNum, pageSize);
            List<ReaderInfoBean> list = readerInfoDao.queryReader(map);
            PageInfo<ReaderInfoBean> page = new PageInfo<ReaderInfoBean>(list);
            return page;
        }
    }

    /**
     * 查询书本
     */
    @Override
    public PageInfo queryBook(Map<String, Object> map) {

        Integer pageNum = Integer.valueOf((Integer) map.get("pageNum"));
        Integer pageSize = Integer.valueOf((Integer) map.get("pageSize"));

        if ((null == pageNum || pageNum == 0) && (null == pageSize || pageSize == 0)){

            List<BookInfoBean> list =  bookInfoDao.queryBook(map);
            PageInfo<BookInfoBean> page = new PageInfo<BookInfoBean>(list);
            page.setList(list);
            return page;

        }

        PageHelper.startPage(pageNum,pageSize);
        List<BookInfoBean> list =  bookInfoDao.queryBook(map);
        PageInfo<BookInfoBean> page = new PageInfo<BookInfoBean>(list);
        return page;
    }

    @Override
    public PageInfo queryReaderType(Map<String, Object> map) {

        Integer pageNum = Integer.valueOf((Integer) map.get("pageNum"));
        Integer pageSize = Integer.valueOf((Integer) map.get("pageSize"));

        if ((null == pageNum || pageNum == 0) && (null == pageSize || pageSize == 0)) {

            List<ReaderTypeBean> list = readerTypeDao.queryReaderType(map);
            PageInfo<ReaderTypeBean> page = new PageInfo<ReaderTypeBean>(list);
            page.setList(list);
            return page;
        }

        PageHelper.startPage(pageNum, pageSize);
        List<ReaderTypeBean> list = readerTypeDao.queryReaderType(map);
        PageInfo<ReaderTypeBean> page = new PageInfo<ReaderTypeBean>(list);
        return page;
    }
}
