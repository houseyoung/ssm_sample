package com.houseyoung.ssm_sample.service;

import com.houseyoung.ssm_sample.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserService
 *
 * @author: zhangteng
 * @time: 2015/3/24 19:25
 */
public interface UserService {

    public void newUser(@Param("user") User user) throws Exception;

    public void update(@Param("user") User user) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<User> listAll() throws Exception;

    public User queryById(@Param("id") int id) throws Exception;

    public boolean checkLogin(User user) throws Exception;
}
