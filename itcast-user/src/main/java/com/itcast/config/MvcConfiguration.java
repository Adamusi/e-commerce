package com.itcast.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description： ：配置拦截器
 * 通过实现WebMvcConfigurer并添加@Configuration注解来实现自定义部分SpringMvc配置。
 * @author： zhangzq
 * @date： 2021/9/26 21:20
 * @modifiedBy：
 * @version: 1.0
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer
{

    @Autowired
    private HandlerInterceptor myInterceptor;

    /**
     * 重写接口中的addInterceptors方法，添加自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}