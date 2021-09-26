package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/26 20:55
 * @modifiedBy：
 * @version: 1.0
 */
@RestController
@RequestMapping("user")
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")Long id){
        return this.userService.queryById(id);
    }
    @GetMapping("hello")
    public String test(){
        return "hello ssm";
    }
}
