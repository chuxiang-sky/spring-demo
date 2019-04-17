package com.chuxiang.learn.spring.demo.aop.javaConfig;

import com.chuxiang.learn.spring.demo.aop.target.Hoopman;
import com.chuxiang.learn.spring.demo.aop.target.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.chuxiang.learn.spring.demo.aop.javaConfig.AspectConfig.class)
public class AspectTest {

    @Autowired
    private Performance performance;

    @Autowired
    private Hoopman hoopman;

    @Test
    public void test(){
        performance.perform();
    }

    @Test
    public void play(){
        hoopman.enter("Kobe");
        hoopman.passFrom("Kobe","Fisher");
        hoopman.score("Kobe",81);
    }
}
