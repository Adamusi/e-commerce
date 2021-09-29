package cn.itcast.service.service;

import cn.itcast.service.mapper.UserMapper;
import cn.itcast.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

    public List<User> queryAll() {
        return  this.userMapper.selectAll();
    }

    @Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }
}
