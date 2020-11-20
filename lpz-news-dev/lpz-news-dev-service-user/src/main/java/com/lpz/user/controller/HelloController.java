package com.lpz.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Create by lpz
 * @date 2020-11-20 15-58-55
 * 描述:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return "hello";
    }
}
