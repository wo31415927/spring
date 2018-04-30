package com.example.demo.dto;

import com.example.demo.service.TestService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/** @author chenxiang 2018/4/30 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyPropTest {
  @Autowired TestService testService;

  @Test
  public void testProp() {
    log.info("Hello Test");
  }
}
