package com.demo.service;

import com.demo.entity.SysUser;

public interface SysUserService {

    SysUser getUser(SysUser sysUser);

    boolean addUser(SysUser sysUser);

    boolean checkLoginName(SysUser sysUser);
}
