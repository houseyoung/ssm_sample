package com.houseyoung.ssm_sample.service.impl;

import com.houseyoung.ssm_sample.entity.User;
import com.houseyoung.ssm_sample.mapper.UserMapper;
import com.houseyoung.ssm_sample.service.UserService;
import com.houseyoung.ssm_sample.utils.MD5Utils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

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

     
    public void newUser(@Param("user") User user) throws Exception {
        if (user == null) {
            return ;
        }

        try {
            user.setPassword(MD5Utils.md5(user.getPassword()));
            userMapper.newUser(user);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }


    public void update(@Param("user") User user) throws Exception {
        if (user == null) {
            return ;
        }

        try {
            userMapper.update(user);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }


    public void deleteById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return ;
        }

        try {
            userMapper.deleteById(id);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }


    public List<User> listAll() throws Exception {
        try {
            return userMapper.listAll();
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }


    public User queryById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return null;
        }
        try {
            return userMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }


    public boolean checkLogin(User user) throws Exception {
        if (user == null) {
            return false;
        }

        try {
            //System.out.println(MD5Utils.md5(user.getPassword()));
            user.setPassword(MD5Utils.md5(user.getPassword()));
            return userMapper.countByUserNameAndPassword(user.getUserName(), user.getPassword()) > 0 ? true : false;
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }

    public User findByUserName(@Param("userName") String userName) throws Exception {
        try {
            return userMapper.findByUserName(userName);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
    }

    public Set<String> findRoles(String userName) throws Exception {
        Set<String> roleSet = Collections.emptySet();
        try {
             roleSet = userMapper.findRoles(userName);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
        return roleSet;
    }

    public Set<String> findPermissions(String username) throws Exception{
        Set<String> permissionSet = Collections.emptySet();
        try {
            permissionSet = userMapper.findPermissions(username);
        } catch (Exception e) {
            throw new Exception("系统内部异常");
        }
        return permissionSet;
    }
}
