package com.lpz.user.controller;

import com.lpz.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Create by lpz
 * @date 2020-11-20 15-58-55
 * 描述:
 */
@RestController
public class HelloController implements HelloControllerApi {

    public Object hello() {
        return "hello";
    }
}
