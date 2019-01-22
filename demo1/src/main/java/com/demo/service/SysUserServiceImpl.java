package com.demo.service;

import com.demo.entity.SysUser;
import com.demo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getUser(SysUser sysUser) {
        return sysUserMapper.uniqueResult(sysUser);
    }

    @Override
    public boolean addUser(SysUser sysUser) {
        int count = sysUserMapper.insert(sysUser);
        if(count>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkLoginName(SysUser sysUser) {
        SysUser sysUser1 = new SysUser();
        sysUser1.setLoginName(sysUser.getLoginName());
        SysUser res = sysUserMapper.uniqueResult(sysUser1);
        if(res!=null){
            return false;
        }
        return true;
    }
}
