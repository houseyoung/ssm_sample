package com.houseyoung.ssm_sample.mapper;

import com.houseyoung.ssm_sample.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * UserMapper
 *
 * @author: zhangteng
 * @time: 2015/3/24 17:02
 */
public interface UserMapper {

    public void newUser(@Param("user") User user) throws Exception;

    public void update(@Param("user") User user) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<User> listAll() throws Exception;

    public User queryById(@Param("id") int id) throws Exception;

    public int countByUserNameAndPassword(@Param("userName") String userName,
                                          @Param("password") String password) throws Exception;

    public User findByUserName(@Param("userName") String userName) throws Exception;

    public Set<String> findRoles(@Param("userName") String userName) throws Exception;

    public Set<String> findPermissions(@Param("userName") String userName) throws Exception;
}
