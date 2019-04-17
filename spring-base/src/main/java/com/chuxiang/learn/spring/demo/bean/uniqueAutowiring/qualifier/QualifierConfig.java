package com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.qualifier;

import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.Dessert;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.Cookies;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.qualifier.annotation.Cooikes;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.Cake;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chuxiang_sky on 2019/04/06.
 * 注解@Qualifier是使用限定符的主要方式。它可以与@Autowired和@Inject注解协同使用，指定需要注入的bean
 * 1、简单使用方式：@Qualifier("iceCream")注解所设置的参数就是想要注入的bean的ID
 * 2、自定义限定符：在声明bean的时候，@Qualifier("cold")所设置的参数就是声明的bean的限定符，在注入的时候可以用@Qualifier使用该限定符
 * 3、自定义限定符注解：创建一个注解，其本身要使用@Qualifier注解来标注
 */
@Configuration
public class QualifierConfig {

    //演示第一种使用方式：见QualifierTest.java
    //演示第二种使用方式
//    @Bean
//    public Dessert cake(){
//        return new Cake();
//    }
//
//    @Bean
//    public Dessert cookies(){
//        return new Cookies();
//    }
//
//    @Bean
//    @Qualifier("cold")
//    public Dessert iceCream(){
//        return new IceCream();
//    }


    @Bean
    public Dessert cake(){
        return new Cake();
    }

    @Bean
    @Cooikes
    public Dessert cookies(){
        return new Cookies();
    }

    @Bean
    public Dessert iceCream(){
        return new IceCream();
    }
}
