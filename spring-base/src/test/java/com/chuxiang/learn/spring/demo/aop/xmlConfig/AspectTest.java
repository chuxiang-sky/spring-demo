package com.chuxiang.learn.spring.demo.aop.xmlConfig;

import com.chuxiang.learn.spring.demo.aop.target.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/spring-aop.xml")
public class AspectTest {
    @Autowired
    private Performance performance;

    @Test
    public void test(){
        performance.perform();
    }
}
