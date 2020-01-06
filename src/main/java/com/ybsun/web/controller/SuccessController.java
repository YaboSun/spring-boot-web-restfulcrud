package com.ybsun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Sun
 * @date 2020/1/6 9:05
 */
@Controller
public class SuccessController {
    /**
     * 这里需要注意的是返回时一个页面，而不是一个值
     * 所以不能加@RequestBody 同理类上不能加RestController
     * @return success
     */
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhansan", "lisi", "wangwu"));
        return "success";
    }

     /* @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }*/
}
