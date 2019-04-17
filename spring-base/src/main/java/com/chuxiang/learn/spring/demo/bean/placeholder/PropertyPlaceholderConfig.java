package com.chuxiang.learn.spring.demo.bean.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by chuxiang_sky on 2019/04/03.
 * 通过@PropertySource注解设置属性源文件，将读取到的文件内容存入Environment中
 */
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertyPlaceholderConfig {

    // 为了使用属性占位符，必须要配置一个PropertyPlaceholderConfigurer或PropertySourcesPlaceholderConfigurer类型的bean
    // 在XML配置中等同于<context:property-placeholder />元素
    // 从Spring 3.1开始，推荐使用后者，因为它能基于Spring Environment及其属性源来解析占位符
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
