package com.chuxiang.learn.spring.demo.bean.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Created by chuxiang_sky on 2019/04/06.
 */
@Configuration
public class ScopeConfig {

    //bean默认作用域就是单例（Singleton）
    @Bean
    public Object singleton(){
        return new Object();
    }

    //将bean的作用域设置为原型（Prototype）
    //两种方式：
    // 1、使用@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    // 2、使用@Scope("prototype")
    // 第一种更加安全并且不易出错
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //@Scope("prototype")
    public Object prototype(){
        return new Object();
    }

    //将bean的作用域设置为会话（Session）
    //三种方式：
    // 1、使用@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.TARGET_CLASS)
    //      WebApplicationContext.SCOPE_SESSION的值是session
    //      proxyMode属性值解决了会话或请求作用域的bean注入到单例bean中所遇到的问题
    //      问题描述：在Spring上下文加载时创建一个单例bean，假设将一个会话作用域的bean注入进这个单例bean时，
    //              此时因为这个会话作用域的bean还没有被创建（直到某个用户进入系统时，创建了会话，才会创建这个bean实例）
    //              在注入时会出现异常。
    //      解决方案：在@Scope设置proxyMode属性值ScopedProxyMode.TARGET_CLASS或者ScopedProxyMode.INTERFACES，
    //              在单例bean中注入会话bean时，实际上就是将这个会话bean的代理类注入到这个单例bean中，
    //              当会话bean实现了接口时，可以将proxyMode属性设置为ScopedProxyMode.INTERFACES，实际原理是使用了JDK来生成基于接口的代理类
    //              当会话bean没有实现接口时，可以将proxyMode属性设置为ScopedProxyMode.TARGET_CLASS，实际原理是使用了CGLIB来生成基于类的代理类
    // 2、使用@Scope("session")
    // 3、使用注解@SessionScope，查看源码发现该注解等同于@Scope("session"),且设置了proxyMode属性值为copedProxyMode.TARGET_CLASS
    // 在XML配置中可在<bean>元素中设置scope属性值为session，且同时使用<aop:scoped-proxy />元素，其默认创建的代理类是基于CGLIB创建的
    // 也可以在<aop:scoped-proxy />元素中显示的设置proxy-target-class属性值为false，使其生成基于接口的代理类
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.TARGET_CLASS)
    //@Scope("session")
    //@SessionScope
    public Object session(){
        return new Object();
    }

    //将bean的作用域设置为会话（Request）
    //三种方式：
    // 1、使用@Scope(value = WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
    // 2、使用@Scope("request")
    // 3、使用注解@RequestScope，查看源码发现该注解等同于@Scope("request"),且设置了proxyMode属性值为copedProxyMode.TARGET_CLASS
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
//    @Scope("request")
//    @RequestScope
    public Object request(){
        return new Object();
    }

    //将bean的作用域设置为web应用（Application）
    //三种方式：
    // 1、使用@Scope(value = WebApplicationContext.SCOPE_APPLICATION,proxyMode = ScopedProxyMode.TARGET_CLASS)
    // 2、使用@Scope("application")
    // 3、使用注解@ApplicationScope，查看源码发现该注解等同于@Scope("application"),且设置了proxyMode属性值为copedProxyMode.TARGET_CLASS
    // Application作用域和Singleton作用域的区别：
    //  1、Singleton作用域是在Spring应用上下文（ApplicationContext，由ContextLoaderListen创建）中只有一个，其生命周期是全局的Spring上下文
    //  2、Application作用域是Spring的Web应用上下文ServletContext范围的
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION,proxyMode = ScopedProxyMode.TARGET_CLASS)
//    @Scope("application")
    @ApplicationScope
    public Object application(){
        return new Object();
    }

}
