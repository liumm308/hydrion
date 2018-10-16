package com.library.manage.api;


import com.library.manage.common.ResultInfo;
import com.library.manage.common.json.JsonPluginsUtil;
import com.library.manage.service.RoleInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by liumm308 on 2018/10/16.
 */
@RestController
public class RoleInfoRest {

    private static Logger logger = LogManager.getLogger(RoleInfoRest.class);

    @Autowired
    RoleInfoService roleInfoService;

    /**
     * roleInfo查询接口
     *
     * @param jsonStr [id,roleName,roleId]
     */
    @RequestMapping(value = "/queryRole", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo queryRole(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("角色查询 request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = roleInfoService.queryRole(jsonStr);

        } catch (Exception e) {
            logger.error("角色查询失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("角色查询 response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;

    }

    /**
     * createRole接口
     *
     * @param jsonStr [id,roleName,roleId]
     */
    @RequestMapping(value = "/createRole", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo createRole(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("createRole request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = roleInfoService.createRole(jsonStr);

        } catch (Exception e) {
            logger.error("createRole 失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("createRole response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }

    /**
     * modifyRole接口
     *
     * @param jsonStr [id,roleName]
     */
    @RequestMapping(value = "/updateRole", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo updateRole(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("updateRole request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = roleInfoService.updateRole(jsonStr);

        } catch (Exception e) {
            logger.error("updateRole 失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("updateRole response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }


    /**
     * deleteRole接口
     *
     * @param jsonStr [id]
     */
    @RequestMapping(value = "/deleteRole", method = RequestMethod.POST, produces = {"application/json; charset=UTF-8"})
    public ResultInfo deleteRole(@RequestBody String jsonStr) {

        ResultInfo resultInfo = new ResultInfo();
        try {

            logger.info("deleteRole request: " + JsonPluginsUtil.beanToJson(jsonStr));

            resultInfo = roleInfoService.deleteRole(jsonStr);
        } catch (Exception e) {
            logger.error("deleteRole 失败: ", e);
            resultInfo.setCode(-1);
        }

        logger.info("deleteRole response: " + JsonPluginsUtil.beanToJson(resultInfo));

        return resultInfo;
    }

}
