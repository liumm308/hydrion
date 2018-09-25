package com.library.manage.api;

import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.UserInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumm308 on 2018/09/20.
 */

@RestController
public class UserInfoRest {

    private static Logger logger = LogManager.getLogger(UserInfoRest.class);

    @Autowired
    private UserInfoService userInfoService;

    /**
     * userInfo查询接口
     *
     * @param jsonStr [id,userName,userPassword,type]
     */
    @RequestMapping(value = "/queryUser", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryUser(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("userInfo查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = userInfoService.queryUser(jsonStr);
        } catch (Exception e) {
            logger.error("userInfo查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("userInfo查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * createUser接口
     *
     * @param jsonStr [id,userName,userPassword,type]
     */
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo createUser(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("createUser request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = userInfoService.insertUser(jsonStr);
        } catch (Exception e) {
            logger.error("createUser失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("createUser response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }

    /**
     * modifyUser接口
     *
     * @param jsonStr [id,userName,userPassword]
     */
    @RequestMapping(value = "/modifyUser", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo modifyUser(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("modifyUser request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = userInfoService.modifyUser(jsonStr);
        } catch (Exception e) {
            logger.error("modifyUser失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("modifyUser response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }


    /**
     * deleteUser接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteUser(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("deleteUser request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = userInfoService.removeUser(jsonStr);
        } catch (Exception e) {
            logger.error("deleteUser失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("deleteUser response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }
}
