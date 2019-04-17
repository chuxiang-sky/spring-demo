package com.chuxiang.learn.spring.demo.bean.config.xmlConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;

import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * Created by chuxiang_sky on 2019/03/30.
 */
public class Indian implements People {

    private String name;
    private List<String> foodList;

    public Indian(String name, List<String> foodList) {
        this.name = name;
        this.foodList = foodList;
    }

    @Override
    public void eat() {
        System.out.println("A Korean named "+name+" like eating "+foodList.stream().collect(joining(",")));
    }
}
