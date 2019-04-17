package com.chuxiang.learn.spring.demo.aop.declareParents.interfaces.impl;

import com.chuxiang.learn.spring.demo.aop.declareParents.interfaces.Bird;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
public class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("能在天上飞");
    }
}
