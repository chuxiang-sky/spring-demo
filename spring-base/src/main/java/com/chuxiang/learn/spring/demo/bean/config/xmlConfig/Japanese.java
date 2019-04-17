package com.chuxiang.learn.spring.demo.bean.config.xmlConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;

/**
 * Created by chuxiang_sky on 2019/03/30.
 */
public class Japanese implements People {

    private Food food;

    public Japanese(){}

    public Japanese(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("Japanese like eating "+food.showType());
    }
}
