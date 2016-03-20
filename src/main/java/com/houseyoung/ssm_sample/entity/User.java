package com.houseyoung.ssm_sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 *
 * @author: zhangteng
 * @time: 2015/3/24 17:09
 */
@Table(name = "t_user")
@Entity
public class User {

    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}