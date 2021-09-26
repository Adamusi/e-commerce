package cn.itcast.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * @description：  SpringBoot的属性注入
 * @author： zhangzq
 * @date： 2021/9/25 12:06
 * @modifiedBy：
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    @Autowired  // 1. @Autowired注入
    private JdbcProperties jdbcProperties;

    //private JdbcProperties jdbcProperties; //2. 构造函数注入
    //
    //public JdbcConfiguration(JdbcProperties jdbcProperties){
    //    this.jdbcProperties = jdbcProperties;
    //}

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }


    //@Bean  //3.bean方法参数注入
    //public DataSource dataSource(JdbcProperties jdbcProperties) {
    //    DruidDataSource dataSource = new DruidDataSource();
    //    dataSource.setUrl(jdbcProperties.getUrl());
    //    dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
    //    dataSource.setUsername(jdbcProperties.getUsername());
    //    dataSource.setPassword(jdbcProperties.getPassword());
    //    return dataSource;
    //}
}

