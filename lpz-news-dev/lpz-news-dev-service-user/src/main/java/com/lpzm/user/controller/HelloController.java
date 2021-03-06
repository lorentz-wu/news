package com.lpzm.user.controller;

import com.lpzm.api.controller.user.HelloControllerApi;
import com.lpzm.grace.result.LPZJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Create by lpzm
 * @date 2020-11-20 15-58-55
 * 描述:
 */
@RestController
public class HelloController implements HelloControllerApi {

    final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    public Object hello() {
        LOGGER.debug("debug: hello!");
        LOGGER.info("info: hello!");
        LOGGER.warn("warn: hello!");
        LOGGER.error("error: hello!");
//        return "hello";
//        return LPZJSONResult.ok();
        return LPZJSONResult.errorMsg("信息有误");
    }
}
