package com.chuxiang.learn.spring.demo.bean.config.javaConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;

/**
 * Created by chuxiang_sky on 2019/03/28.
 * 不同于com.chuxiang.learn.spring.demo.bean.autowiring.interfaces.impl包中的Chinese类
 * 去掉了@Component注解和@Autowired注解
 */
public class American implements People {

    private Food food;

    public American(){}

    public American(Food food) {
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
        System.out.println("American like eating "+food.showType());
    }
}
