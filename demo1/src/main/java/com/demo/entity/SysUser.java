package com.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private Integer id;
    private String userName;
    private String loginName;
    private String password;
    private Date lastLoginTime;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }

    public SysUser(Integer id, String userName, String loginName, String password, Date lastLoginTime) {
        this.id = id;
        this.userName = userName;
        this.loginName = loginName;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
    }

    public SysUser() {
    }
}
