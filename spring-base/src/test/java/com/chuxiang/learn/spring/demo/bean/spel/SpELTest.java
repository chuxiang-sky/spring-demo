package com.chuxiang.learn.spring.demo.bean.spel;

import com.chuxiang.learn.spring.demo.bean.spel.Computer;
import com.chuxiang.learn.spring.demo.bean.spel.SpELConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpELConfig.class)
public class SpELTest {

    @Autowired
    private Computer computer;

    @Test
    public void test(){
        System.out.println(computer.toString());
    }
}
