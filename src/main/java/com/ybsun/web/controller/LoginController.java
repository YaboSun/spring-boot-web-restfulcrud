package com.ybsun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Sun
 * @date 2020/1/7 10:12
 */
@Controller
public class LoginController {
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String password,
                        Map<String, Object> map) {
        String defaultPassword = "123456";
        if (!StringUtils.isEmpty(userName) && defaultPassword.equals(password)) {
            // 登录成功，为防止表单重复提交，重定向到main.html
            return "redirect:/main.html";
        } else {
            // 登录失败
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
