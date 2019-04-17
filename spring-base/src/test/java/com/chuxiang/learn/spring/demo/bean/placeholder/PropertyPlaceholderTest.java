package com.chuxiang.learn.spring.demo.bean.placeholder;

import com.chuxiang.learn.spring.demo.bean.placeholder.Computer;
import com.chuxiang.learn.spring.demo.bean.placeholder.PropertyPlaceholderConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PropertyPlaceholderConfig.class)
public class PropertyPlaceholderTest {

    @Autowired
    private Computer computer;

    @Test
    public void test(){
        System.out.println(computer.toString());
    }
}
