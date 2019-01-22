package com.demo.mapper;

import com.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {
    int insert(SysUser sysUser);

    SysUser uniqueResult(SysUser sysUser);

    int delete(SysUser sysUser);

    List<SysUser> list();
}
