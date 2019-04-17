package com.chuxiang.learn.spring.demo.bean.profile.interfaces.impl;

import com.chuxiang.learn.spring.demo.bean.profile.interfaces.IEnvironment;

/**
 * Created by chuxiang_sky on 2019/04/01.
 */
public class DevelopmentEnvironment implements IEnvironment {
    @Override
    public void showEnvironmentInfo() {
        System.out.println("This is a development environment");
    }
}
