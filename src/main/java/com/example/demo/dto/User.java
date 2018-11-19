package com.example.demo.dto;

import com.example.demo.enums.OsType;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

import lombok.AllArgsConstructor;

/** @author chenxiang 2018/4/30 */
@Component
@AllArgsConstructor
@ConfigurationProperties(prefix = "test.user")
public class User {
  public User() {}

  public User(int id) {
    this.id = id;
  }

  protected int id;
  protected String name;
  protected OsType osType;
  protected Map<String,String> friendMap;
}
