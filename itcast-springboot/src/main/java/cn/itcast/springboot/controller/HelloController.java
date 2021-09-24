package cn.itcast.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/24 10:31
 * @modifiedBy：
 * @version: 1.0
 */

@RestController
@EnableAutoConfiguration
public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}