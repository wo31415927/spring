package com.example.demo.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "test.user.cur")
@AllArgsConstructor
@Getter
@Setter
public class MyProp {
  public MyProp() {
  }

  private int id;
  private String name;
}
