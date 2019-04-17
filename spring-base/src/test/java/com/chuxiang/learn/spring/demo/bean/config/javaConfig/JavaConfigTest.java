package com.chuxiang.learn.spring.demo.bean.config.javaConfig;

import com.chuxiang.learn.spring.demo.bean.config.javaConfig.JavaConfig;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/03/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class JavaConfigTest {

    @Autowired
    private People chinese;

    @Test
    public void test(){
        chinese.eat();
    }
}
