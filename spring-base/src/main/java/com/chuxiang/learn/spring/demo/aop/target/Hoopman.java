package com.chuxiang.learn.spring.demo.aop.target;

import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@Component
public class Hoopman {

    public void enter(String player){
        System.out.println(player+" enter the field");
    }

    public void passFrom(String passedName,String passingName){
        System.out.println(passedName+" get the ball from "+passingName);
    }

    public String score(String player,int point){
        System.out.println(player+" get "+point+" score");
        return "win";
    }
}
