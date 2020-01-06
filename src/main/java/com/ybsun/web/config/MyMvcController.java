package com.ybsun.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Sun
 * @date 2020/1/6 15:49
 *
 * 扩展SpringMvc功能，浏览器访问viewController可以响应success
 */
@Configuration
public class MyMvcController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*super.addViewControllers(registry);*/
        registry.addViewController("/viewController").setViewName("success");
    }
}
