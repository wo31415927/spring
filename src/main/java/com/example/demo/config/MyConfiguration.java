package com.example.demo.config;

import com.example.demo.dto.MyProp;
import com.example.demo.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @author chenxiang */
@Configuration(value="myConf")
@EnableConfigurationProperties(MyProp.class)
public class MyConfiguration {
  /**
   * 显示引用myProp
   */
  //  @Autowired private MyProp myProp;
  @Autowired private ApplicationContext applicationContext;

  /**
   * 显式声明注入User对象user4
   * @param user1
   * @return
   */
  @Bean(value="user0")
  public User user(User user1) {
    return new User(0);
  }

  /**
   * 隐式引用注入对象myProp
   * 使用函数名注入User对象user1
   * @param myProp
   * @return
   */
  @Bean
  public User user1(MyProp myProp) {
    System.out.println(myProp);
    return new User(1);
  }



  @Bean
  public User user2(User user0) {
    return new User();
  }

  @Bean
  public User user3(User user2) {
    return new User();
  }
}
