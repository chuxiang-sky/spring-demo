package com.chuxiang.learn.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by chuxiang_sky on 2019/04/09.
 * 和WebConfig扫描的包一样，但是过滤掉了由@EnableWebMvc标注的配置类（WebConfig）所属的bean
 */
@Configuration
@ComponentScan(basePackages = "com.chuxiang.learn.spring.mvc",
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
    })
public class RootConfig {
}
