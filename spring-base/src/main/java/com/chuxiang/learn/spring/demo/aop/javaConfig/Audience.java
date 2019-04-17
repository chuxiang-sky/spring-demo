package com.chuxiang.learn.spring.demo.aop.javaConfig;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/06.
 * 使用@Aspect注解在类级别上来将该类定义为一个切面
 * 需要在maven中添加依赖，如下：
 * <dependency>
 *     <groupId>org.aspectj</groupId>
 *     <artifactId>aspectjweaver</artifactId>
 *     <version>1.9.2</version>
 * </dependency>
 *
 *
 */
@Aspect
@Component
public class Audience {

    //@Pointcut注解中execution属性设置的连接点从返回值的类型开始，*表示全匹配，后面紧跟着类的全限定名称和方法名，参数列表可以用..表示任意的参数
    @Pointcut("execution(* com.chuxiang.learn.spring.demo.aop.target.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void takeSeats(JoinPoint jp){
//        System.out.println("Taking seats");
    }

    @After("performance()")
    public void applause(){
//        System.out.println("CLAP CLAP CLAP!!!");
    }

    @Around("performance()")
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
