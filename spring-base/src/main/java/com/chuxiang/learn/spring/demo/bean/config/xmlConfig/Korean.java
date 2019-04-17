package com.chuxiang.learn.spring.demo.bean.config.xmlConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;

/**
 * Created by chuxiang_sky on 2019/03/30.
 */
public class Korean implements People {

    private String name;
    private String food;

    public Korean(String name, String food) {
        this.name = name;
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("A Korean named "+name+" like eating "+food);
    }
}
