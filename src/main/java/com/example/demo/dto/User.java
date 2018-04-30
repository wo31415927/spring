package com.example.demo.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;

/** @author chenxiang 2018/4/30 */
@AllArgsConstructor
@ConfigurationProperties(prefix = "test.user")
public class User {
  public User() {}

  public User(int id) {
    this.id = id;
  }

  protected int id;
  protected String name;
}
