package com.chuxiang.learn.spring.demo.bean.config.javaConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;

/**
 * Created by chuxiang_sky on 2019/03/28.
 */
public class Beef implements Food {
    @Override
    public String showType() {
        return "beef";
    }
}
