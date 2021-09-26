package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/24 10:31
 * @modifiedBy：
 * @version: 1.0
 */

@RestController
@RequestMapping("hello")
public class HelloController
{

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test()
    {
        return "hello Spring Boot!";
    }
}