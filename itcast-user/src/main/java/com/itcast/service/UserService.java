package com.itcast.service;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description：
 * @author： zhangzq
 * @date： 2021/9/26 21:45
 * @modifiedBy：
 * @version: 1.0
 */
@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;



    public User queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }
}
