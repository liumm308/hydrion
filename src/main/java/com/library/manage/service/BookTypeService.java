package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface BookTypeService {

    ResultInfo queryBookType(String jsonStr);

    ResultInfo queryBookTypeByName(String jsonStr);

    ResultInfo createBookType(String jsonStr);

    ResultInfo updateBookType(String jsonStr);

    ResultInfo deleteBookType(String jsonStr);
}
