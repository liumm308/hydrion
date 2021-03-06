package com.library.manage.handler;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface IParamHandler {

    PageInfo queryUser(Map<String, Object> map);

    PageInfo queryReader(Map<String, Object> map);

    PageInfo queryBook(Map<String, Object> map);

    PageInfo queryReaderType(Map<String, Object> map);

    PageInfo queryBookType(Map<String, Object> map);

    PageInfo queryBookTypeByName(Map<String, Object> map);

    PageInfo queryBookNumByType(Map<String, Object> map);

    PageInfo queryRole(Map<String, Object> map);
}
