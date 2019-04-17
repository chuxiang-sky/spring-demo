package com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.primary;

import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.Dessert;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.primary.PrimaryConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PrimaryConfig.class)
public class PrimaryTest {

    @Autowired
    private Dessert dessert;

    @Test
    public void test(){

    }
}
