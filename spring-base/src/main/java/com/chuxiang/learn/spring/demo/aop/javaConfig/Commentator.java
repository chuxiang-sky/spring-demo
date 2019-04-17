package com.chuxiang.learn.spring.demo.aop.javaConfig;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@Component
@Aspect
public class Commentator {

    @Pointcut("execution(* com.chuxiang.learn.spring.demo.aop.target.Hoopman.enter(String)) && args(player)")
    private void enter(String player){}

    @Pointcut("execution(* com.chuxiang.learn.spring.demo.aop.target..Hoopman.passFrom(String,String)) && args(passedName,passingName)")
    private void pass(String passedName,String passingName){}

    @Pointcut("execution(* com.chuxiang.learn.spring.demo.aop.target..Hoopman.score(String,int)) && args(player,point)")
    private void score(String player,int point){}

    @Before("enter(player)")
    public void welcome(String player){
        System.out.println("Commentator says:let us welcome "+player);
    }

    @After("pass(passed,passing)")
    public void passing(String passed,String passing){
        System.out.println("Commentator says:"+passed+" get the ball from "+passing);
    }

    @AfterReturning(value="score(player,point)",returning = "result")
    public void announce(String player,int point,String result){
        System.out.println("Commentator says:"+player+" get "+point+" score");
        System.out.println("Commentator says:Lakers "+result);
    }
}
