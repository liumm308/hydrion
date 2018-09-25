package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface ReaderInfoService {
    ResultInfo queryReader(String jsonStr);

    ResultInfo createReader(String jsonStr);

    ResultInfo modifyReader(String jsonStr);

    ResultInfo deleteReader(String jsonStr);

}
