package com.chuxiang.learn.spring.demo.aop.xmlConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/07.
 * 定义一个普通的类，用于XML配置的切面
 *
 */
public class Audience {

    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    public void takeSeats(){
        System.out.println("Taking seats");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();//不调用ProceedingJoinPoint.proceed()方法会阻塞通知方法
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable e){//此处是Throwable
            System.out.println("Demanding a refund");
        }
    }


}
