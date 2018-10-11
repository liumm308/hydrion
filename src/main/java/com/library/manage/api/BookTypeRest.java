package com.library.manage.api;

import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.BookTypeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumm308 on 2018/09/30.
 */
@RestController
public class BookTypeRest {

    private static Logger logger = LogManager.getLogger(ReaderTypeRest.class);

    @Autowired
    private BookTypeService bookTypeService;

    /**
     * BookType查询接口
     *
     * @param jsonStr [id,bookTypeName,...]
     */
    @RequestMapping(value = "/queryBookType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryBookType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookType 查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = bookTypeService.queryBookType(jsonStr);

        } catch (Exception e) {

            logger.error("bookType 查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookType 查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * BookTypeByName查询接口
     *
     * @param jsonStr [id,bookTypeName,...]
     */
    @RequestMapping(value = "/queryBookTypeByName", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryBookTypeByName(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookType 查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = bookTypeService.queryBookTypeByName(jsonStr);

        } catch (Exception e) {

            logger.error("bookType 查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookType 查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }


    /**
     * BookType创建接口
     *
     * @param jsonStr [id,bookTypeName,...]
     */
    @RequestMapping(value = "/createBookType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo createBookType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookType 创建 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = bookTypeService.createBookType(jsonStr);

        } catch (Exception e) {

            logger.error("bookType 创建失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookType 创建 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * BookType修改接口
     *
     * @param jsonStr [id,bookTypeName,...]
     */
    @RequestMapping(value = "/updateBookType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo updateBookType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookType 修改 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = bookTypeService.updateBookType(jsonStr);

        } catch (Exception e) {

            logger.error("bookType 修改失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookType 修改 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * BookType删除接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteBookType", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteBookType(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("bookType 删除 request: " + JsonPluginsUtil.beanToJson(jsonStr));
            resultInfo = bookTypeService.deleteBookType(jsonStr);

        } catch (Exception e) {

            logger.error("bookType 删除失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("bookType 删除 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

}
