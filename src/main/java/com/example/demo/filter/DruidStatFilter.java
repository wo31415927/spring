package com.example.demo.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/** @author cctv */
@WebFilter(
  filterName = "druidWebStatFilter",
  urlPatterns = "/*",
  initParams = {
    @WebInitParam(
      name = "exclusions",
      value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"
    ), //忽略资源
    @WebInitParam(name = "profileEnable", value = "true") //监控单个url调用的sql列表
  }
)
public class DruidStatFilter extends WebStatFilter {}
