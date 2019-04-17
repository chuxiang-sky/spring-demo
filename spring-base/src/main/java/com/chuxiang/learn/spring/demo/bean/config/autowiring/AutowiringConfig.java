package com.chuxiang.learn.spring.demo.bean.config.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chuxiang_sky on 2019/03/28.
 * 隐式的bean发现机制和自动装配，关键在于以下两点：
 * 1、组件扫描（component scanning）：Spring会自动发现应用上下文中所创建的bean（被@Component注解标注的类）
 * 2、自动装配（autowiring）：Spring自动满足bean之间的依赖。
 * 这种方式需要sprin-context组件支持，包括@Configuration、@ComponentScan、@Component、@Autowired注解
 * @Configuration注解：
 *      用于定义配置类，可以替换spring-xxx.xml配置文件中的Spring context名命空间的<context:component-scan></context:component-scan>标签
 *      可以在被该注解标注的类中被@Bean标注的方法，
 *    这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
 *    并用于构建bean定义，初始化Spring容器。
 *      该注解的配置类有如下要求：
 *      1、不可以是final类型；2、不可以是匿名类；3、嵌套的configuration必须是静态类。
 * @ComponentScan注解：
 *      主要就是定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中。
 *      如果没有为@ComponentScan注解设置任何属性，则它会以配置类所在的包作为基础包来扫描组建。
 *      1、扫描包：value属性可以指定一个或多个扫描的包路径，使用如下：
 *          单个：@ComponentScan(value="xxx.xxx.xx"),其中【value=】可省略；
 *          多个：@ComponentScan(value={"xxx.xxx.xx","yyy.yy.yy","zzz.zz.*"}),其中【value=】可省略。
 *      2、扫描包：basePackages属性可以指定一个或多个扫描的包路径，使用如下：
 *          单个：@ComponentScan(basePackages="xxx.xxx.xx"),其中【basePackages=】可省略；
 *          多个：@ComponentScan(basePackages={"xxx.xxx.xx","yyy.yy.yy","zzz.zz.*"}),其中【basePackages=】可省略。
 *      3、扫描类：basePackageClasses属性可以指定一个或多个扫描的类路径，使用如下：
 *          单个：@ComponentScan(basePackageClasses="xxx.Class"),其中【basePackageClasses=】不可省略；
 *          多个：@ComponentScan(basePackageClasses={"xxx.Class","yyy.Class","zzz.Class"}),,其中【basePackageClasses=】不可省略。
 *
 * 以上两个注解需要引入spring-context组件
 */
@Configuration
@ComponentScan
public class AutowiringConfig {
}
