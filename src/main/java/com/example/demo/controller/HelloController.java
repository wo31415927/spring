package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author chenxiang 2018/3/29 */
@ComponentScan("com.example.demo")
@RestController
public class HelloController {
  @RequestMapping("/hello")
  public String index() {
    return "Hello World";
  }
}
