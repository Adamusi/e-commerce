package cn.itcast.service.controller;

import cn.itcast.service.pojo.User;
import cn.itcast.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public User queryUserById(@PathVariable("id")Long id) {
        // 查询一条用户信息
        return this.userService.queryById(id);
    }

}
