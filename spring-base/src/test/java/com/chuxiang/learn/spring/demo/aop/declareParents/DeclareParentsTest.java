package com.chuxiang.learn.spring.demo.aop.declareParents;

import com.chuxiang.learn.spring.demo.aop.declareParents.bean.People;
import com.chuxiang.learn.spring.demo.aop.declareParents.interfaces.Bird;
import com.chuxiang.learn.spring.demo.aop.javaConfig.AspectConfig;
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
@ContextConfiguration(classes = {DeclareParentsConfig.class})
public class DeclareParentsTest {
    @Autowired
    private People people;

    @Test
    public void test(){
        people.run();
        Bird bird = (Bird) people;
        bird.fly();
    }
}
