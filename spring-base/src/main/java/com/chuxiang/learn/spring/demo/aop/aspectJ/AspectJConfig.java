package com.chuxiang.learn.spring.demo.aop.aspectJ;

import com.chuxiang.learn.spring.demo.aop.target.ConcretePerformance;
import com.chuxiang.learn.spring.demo.aop.target.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@Configuration
public class AspectJConfig {

    @Bean
    public Performance performance(){
        return new ConcretePerformance();
    }

    @Bean
    public CriticismEngine criticismEngine(){
        CriticismEngineImpl criticismEngine = new CriticismEngineImpl();
        List<String> criticismList = new ArrayList<String>(){
            {
                add("good");
                add("bad");
                add("just so so");
            }
        };
        String[] criticismPool = null;
        criticismEngine.setCriticismPool(criticismList.toArray(criticismPool));
        return criticismEngine;
    }
}
