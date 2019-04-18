package com.chuxiang.learn.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by chuxiang_sky on 2019/04/09.
 * 使用Java配置类，需要至少两个注解@Configuration和@EnableWebMvc
 * 注解@Configuration用来标注该类为Java配置类
 * 注解@EnableWebMvc用来启用Spring MVC，相当于xml配置的<mvc:annotation-driven/>
 *
 * 注解@ComponentScan为可选的，详细说明可参考com.chuxiang.learn.spring.demo.bean.config.autowiring.AutowiringConfig.java
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.chuxiang.learn.spring.mvc")
public class WebConfig extends WebMvcConfigurationSupport{

    // 若没有配置视图解析器的话，Spring默认使用BeanNameCiewResolver，
    // 这个视图解析器会查找ID与视图名称匹配的bean，并且查找的bean要实现View接口
    @Bean
    public ViewResolver viewResolver(){
        // 创建一个InternalResourceViewResolver类型的视图解析器
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");//设置前缀
        resolver.setSuffix(".jsp");//设置后缀
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    // 配置静态资源的处理
    // 若没有该配置的话，DIspatcherServlet会映射为应用默认Servlet，它会处理所有请求，包括对静态资源的请求
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
