package com.houseyoung.ssm_sample.test;

import com.houseyoung.ssm_sample.entity.User;
import com.houseyoung.ssm_sample.service.UserService;
import com.houseyoung.ssm_sample.utils.MD5Utils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserServiceTest
 *
 * @author: zhangteng
 * @time: 2015/3/24 20:02
 */
public class UserServiceTest extends AbstractTestCase {
    @Autowired
    private UserService userService;

    @Test
    public void newUser() throws Exception {
        User user = new User();
        user.setUserName("yy");
        user.setPassword(MD5Utils.md5("admin".getBytes()));

        userService.newUser(user);

    }

    @Test
    public void testGeneratePassword() throws Exception{

            User user = userService.findByUserName("admin");
        System.out.println(user.getSalt());
    }
}
