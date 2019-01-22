package com.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.demo.entity.SysUser;
import com.demo.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Environment environment;

    //@Autowired
    private DruidDataSource druidDataSource;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void test(){
        SysUser sysUser = new SysUser();
        sysUser.setLoginName("jinzige");
        System.out.println(sysUserMapper);
        //sysUserMapper.delete(sysUser);
        List<SysUser> list = sysUserMapper.list();
        System.out.println(list);
    }

    @Test
    public void testDatasource()
    {
        System.out.println(sysUserMapper.list());
    }

    @Test
    public void contextLoads() throws Exception{
        Connection connection = null;
        try {
            connection = druidDataSource.getConnection();
            Statement statement = connection.createStatement();
            String sql = "insert into sys_user(user_name,login_name,password,last_login_time)values('金子哥','jinjiacheng','123456',sysdate())";
            int result = statement.executeUpdate(sql);
            if(result>0){
                System.out.println(result);
            }else {
                System.out.println("0");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection!=null){
                connection.close();
            }
        }

    }

}

