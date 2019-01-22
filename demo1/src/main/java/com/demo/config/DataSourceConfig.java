package com.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.sql.SQLException;

//@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment environment;

    //@Bean(name="dataSource")
    public DruidDataSource dataSource()throws SQLException{
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(environment.getProperty("db.driver"));
        druidDataSource.setUrl(environment.getProperty("db.url"));
        druidDataSource.setUsername(environment.getProperty("db.username"));
        druidDataSource.setPassword(environment.getProperty("db.password"));
        //druidDataSource.setInitialSize("${db.pool.ini-size}");
        return druidDataSource;
    }
}
