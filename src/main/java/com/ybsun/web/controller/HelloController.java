package com.ybsun.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sun
 * @date 2020/1/5 14:36
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot web";
    }
}
