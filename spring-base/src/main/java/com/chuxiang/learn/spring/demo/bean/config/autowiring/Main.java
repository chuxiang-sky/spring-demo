package com.chuxiang.learn.spring.demo.bean.config.autowiring;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chuxiang_sky on 2019/04/07.
 * 常用应用上下文：
 * AnnotationConfigApplicationContext:从一个或多个基于Java的配置类中加载Spring应用上下文
 * AnnotationConfigWebApplicationContext：从一个或多个基于Java的配置类中加载Spring Web应用上下文
 *
 * ClassPathXmlApplicationContext:从类路径下的一个或多个XML配置文件中加载上下文定义，把应用上下文的定义文件作为类资源
 * FileSystemXmlApplicationContext:从文件系统下的一个或多个XML配置文件中加载上下文定义
 * XmlWebApplicationContext:从Web应用下的一个或多个XML配置文件中加载上下文定义
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiringConfig.class);
        People p = context.getBean(People.class);
        p.eat();
    }
}
