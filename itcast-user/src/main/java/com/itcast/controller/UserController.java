package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/26 20:55
 * @modifiedBy：
 * @version: 1.0
 */
@Controller
@RequestMapping("user")
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id")Long id) {
        // 查询一条用户信息
        return this.userService.queryById(id);
    }
    @GetMapping("hello")
    @ResponseBody
    public String test(){
        return "hello ssm";
    }

    @GetMapping("all/list")
    public String all(Model model) {
        //查询用户
        List<User> users = this.userService.queryAll();
        //放入模型
       model.addAttribute("users",users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "user";
    }
}
