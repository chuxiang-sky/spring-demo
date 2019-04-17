package com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.primary;

import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.Dessert;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.Cookies;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.Cake;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.impl.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by chuxiang_sky on 2019/04/03.
 * 当存在多个相同类型的bean的时候，自动装配时无法从中选择某一个
 * 可使用@Primary注解标注这个bean为首选项
 * @Primary注解可以和@Component注解、@Bean注解组合使用，将声明的bean设置为首选bean
 * 在XML配置中可在<bean>元素中通过设置primary="true"来指定首选的bean
 * 但是当同类型的bean上也有多个被@Primary注解标注时，问题还是无法得到解决，自动装配存在歧义性
 */
@Configuration
//@ComponentScan("com.chuxiang.learn.spring.demo.uniqueAutowiring.interfaces")
public class PrimaryConfig {

    @Bean
    @Primary
    public Dessert cake(){
        return new Cake();
    }

    @Bean
    public Dessert cookies(){
        return new Cookies();
    }

    @Bean
    public Dessert iceCream(){
        return new IceCream();
    }
}
