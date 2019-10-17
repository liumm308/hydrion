package com.library.manage.api;

import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.BookInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumm308 on 2018/09/26.
 */
@RestController
public class BookInfoRest {
    private static Logger logger = LogManager.getLogger(BookInfoRest.class);

    @Autowired
    private BookInfoService bookInfoService;

    /**
     * BookInfo查询接口
     *
     * @param jsonStr [id,readerName,readerType,...]
     */
    @RequestMapping(value = "/queryBook", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryBook(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookInfo查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = bookInfoService.queryBook(jsonStr);
        } catch (Exception e) {
            logger.error("bookInfo查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookInfo查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * BookInfoForTypeNums查询接口
     *
     * @param jsonStr []
     */
    @RequestMapping(value = "/queryBookNumByType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryBookNumByType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("BookInfoForTypeNums 查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = bookInfoService.queryBookNumByType(jsonStr);
        } catch (Exception e) {
            logger.error("BookInfoForTypeNums 查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("BookInfoForTypeNums 查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * insertBook接口
     *
     * @param jsonStr [id,readerName,readerType,readerAge,readerSex,...]
     */
    @RequestMapping(value = "/insertBook", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo insertBook(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("insertBook request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = bookInfoService.insertBook(jsonStr);
        } catch (Exception e) {
            logger.error("insertBook失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("insertBook response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }


    /**
     * deleteBook接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteBook", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteBook(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("deleteBook request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = bookInfoService.deleteBook(jsonStr);
        } catch (Exception e) {
            logger.error("deleteBook失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("deleteBook response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }
}
