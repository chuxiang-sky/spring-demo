package com.chuxiang.learn.spring.demo.aop.declareParents.bean;

import com.chuxiang.learn.spring.demo.aop.declareParents.bean.People;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@Component
public class Man implements People {
    @Override
    public void run() {
        System.out.println("只能在地上奔跑");
    }
}
