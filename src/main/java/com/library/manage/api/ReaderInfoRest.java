package com.library.manage.api;

import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.ReaderInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumm308 on 2018/09/25.
 */
@RestController
public class ReaderInfoRest {
    private static Logger logger = LogManager.getLogger(ReaderInfoRest.class);

    @Autowired
    private ReaderInfoService readerInfoService;

    /**
     * ReaderInfo查询接口
     *
     * @param jsonStr [id,readerName,readerType,...]
     */
    @RequestMapping(value = "/queryReader", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryReader(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("readerInfo查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = readerInfoService.queryReader(jsonStr);
        } catch (Exception e) {
            logger.error("readerInfo查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("readerInfo查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * createReader接口
     *
     * @param jsonStr [id,readerName,readerType,readerAge,readerSex,...]
     */
    @RequestMapping(value = "/createReader", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo createReader(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("createReader request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = readerInfoService.createReader(jsonStr);
        } catch (Exception e) {
            logger.error("createReader失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("createReader response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }



    /**
     * modifyReader接口
     *
     * @param jsonStr [id,readerName,readerType,...]
     */
    @RequestMapping(value = "/modifyReader", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo modifyReader(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("modifyReader request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = readerInfoService.modifyReader(jsonStr);
        } catch (Exception e) {
            logger.error("modifyReader失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("modifyReader response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }

    /**
     * deleteReader接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteReader", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteReader(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("deleteReader request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = readerInfoService.deleteReader(jsonStr);
        } catch (Exception e) {
            logger.error("deleteReader失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("deleteReader response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }


}
