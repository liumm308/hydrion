package com.library.manage.service;

import com.library.manage.common.ResultInfo;

public interface ReaderTypeService {

    ResultInfo queryReaderType(String jsonStr);

    ResultInfo createReaderType(String jsonStr);

    ResultInfo updateReaderType(String jsonStr);

    ResultInfo deleteReaderType(String jsonStr);
}
