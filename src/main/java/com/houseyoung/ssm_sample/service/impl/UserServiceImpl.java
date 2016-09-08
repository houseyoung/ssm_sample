package com.houseyoung.ssm_sample.service.impl;

import com.houseyoung.ssm_sample.entity.User;
import com.houseyoung.ssm_sample.mapper.UserMapper;
import com.houseyoung.ssm_sample.service.UserService;
import com.houseyoung.ssm_sample.utils.MD5Utils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author: zhangteng
 * @time: 2015/3/24 19:26
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void newUser(@Param("user") User user) throws Exception {
        if (user == null) {
            return ;
        }

        try {
            user.setPassword(MD5Utils.md5(user.getPassword()));
            userMapper.newUser(user);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void update(@Param("user") User user) throws Exception {
        if (user == null) {
            return ;
        }

        try {
            userMapper.update(user);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void deleteById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return ;
        }

        try {
            userMapper.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<User> listAll() throws Exception {
        try {
            return userMapper.listAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public User queryById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return null;
        }
        try {
            return userMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean checkLogin(User user) throws Exception {
        if (user == null) {
            return false;
        }

        try {
            user.setPassword(MD5Utils.md5(user.getPassword()));
            return userMapper.countByUserNameAndPassword(user.getUserName(), user.getPassword()) > 0 ? true : false;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
