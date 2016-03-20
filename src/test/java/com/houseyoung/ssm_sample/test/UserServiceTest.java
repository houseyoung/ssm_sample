package com.houseyoung.ssm_sample.test;

import com.houseyoung.ssm_sample.entity.User;
import com.houseyoung.ssm_sample.service.UserService;
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
        user.setUserName("houseyoung");
        user.setPassword("12345678");

        userService.newUser(user);

    }
}
