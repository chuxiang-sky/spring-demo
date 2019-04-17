package com.chuxiang.learn.spring.demo.bean.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chuxiang_sky on 2019/04/02.
 * 通过@PropertySource注解设置属性源文件，将读取到的文件内容存入Environment中
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ConditionConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
