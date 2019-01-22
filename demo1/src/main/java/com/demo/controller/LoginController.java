package com.demo.controller;

import com.demo.entity.Message;
import com.demo.entity.SysUser;
import com.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/addUser")
    public Message addUser(@RequestBody SysUser sysUser){
        Message message = new Message();
        boolean res = sysUserService.checkLoginName(sysUser);
        if(!res){
            message.setException("该用户已存在！");
            return message;
        }
        boolean success = sysUserService.addUser(sysUser);
        if(success){
            message.setMsg("注册用户成功！");
        }else{
            message.setMsg("注册用户失败");
        }
        return message;
    }

}
