package com.joe.jojo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * myBatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.joe.jojo.mapper","com.joe.jojo.dao"})
public class MyBatisConfig {
}
