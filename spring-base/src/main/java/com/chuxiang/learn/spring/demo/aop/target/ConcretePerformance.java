package com.chuxiang.learn.spring.demo.aop.target;

import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/06.
 */
@Component
public class ConcretePerformance implements Performance {

    public void perform(){
        System.out.println("playing a music");
    }
}
