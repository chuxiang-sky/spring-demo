package com.chuxiang.learn.spring.demo.aop.javaConfig;

import com.chuxiang.learn.spring.demo.aop.target.ConcretePerformance;
import com.chuxiang.learn.spring.demo.aop.target.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/06.
 * 在JavaConfig中的配置类的类级别上通过使用@EnableAspectJAutoProxy注解启动自动代理功能
 * 等同于在xml配置中使用<aop:aspectj-autoproxy />
 */
@Configuration
@ComponentScan("com.chuxiang.learn.spring.demo.aop")
@EnableAspectJAutoProxy
public class AspectConfig {
    @Bean
    public Performance performance(){
        return new ConcretePerformance();
    }
}
