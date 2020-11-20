package com.lpz.user.controller;

import com.lpz.api.controller.user.HelloControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Create by lpz
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
        return "hello";
    }
}
