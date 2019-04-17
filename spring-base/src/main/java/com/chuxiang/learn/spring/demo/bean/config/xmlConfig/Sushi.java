package com.chuxiang.learn.spring.demo.bean.config.xmlConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;

/**
 * Created by chuxiang_sky on 2019/03/30.
 */
public class Sushi implements Food {
    @Override
    public String showType() {
        return "sushi";
    }
}
