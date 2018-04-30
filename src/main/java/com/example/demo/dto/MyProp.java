package com.example.demo.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "test.user")
@AllArgsConstructor
@Getter
@Setter
public class MyProp {
  public MyProp() {
  }

  private int id;
  private String name;
}
