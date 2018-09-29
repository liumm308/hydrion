package com.library.manage.api;


import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.ReaderTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by liumm308 on 2018/09/29.
 */
@RestController
public class ReaderTypeRest {

    private static Logger logger = LogManager.getLogger(ReaderTypeRest.class);

    @Autowired
    private ReaderTypeService readerTypeService;

    /**
     * ReaderType查询接口
     *
     * @param jsonStr [id,typeName,...]
     */
    @RequestMapping(value = "/queryReaderType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryReaderType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("readerType查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = readerTypeService.queryReaderType(jsonStr);

        } catch (Exception e) {

            logger.error("readerType 查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("readerType 查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * ReaderType创建接口
     *
     * @param jsonStr [id,typeName,...]
     */
    @RequestMapping(value = "/createReaderType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo createReaderType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("readerType 创建 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = readerTypeService.createReaderType(jsonStr);

        } catch (Exception e) {

            logger.error("readerType 创建失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("readerType 创建 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * readerType修改接口
     *
     * @param jsonStr [id,typeName,...]
     */
    @RequestMapping(value = "/updateReaderType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo updateReaderType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("readerType 修改 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = readerTypeService.updateReaderType(jsonStr);

        } catch (Exception e) {

            logger.error("readerType 修改失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("readerType 修改 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * readerType删除接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteReaderType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteReaderType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("deleteReaderType request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = readerTypeService.deleteReaderType(jsonStr);

        } catch (Exception e) {

            logger.error("deleteReaderType 失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("deleteReaderType response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }
}
