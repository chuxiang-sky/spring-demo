package com.chuxiang.learn.spring.demo.bean.config.autowiring;

import com.chuxiang.learn.spring.demo.bean.config.autowiring.AutowiringConfig;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/03/28.
 * @RunWith(SpringJUnit4ClassRunner.class):
 *      @RunWith注解是启用测试运行器；
 *      SpringJUnit4ClassRunner.class是为了在测试开始的时候自动创建Spring的上下文，需要引入spring-test组件.
 *
 * @ContextConfiguration(classes = JavaConfig.class)：
 *      告诉测试运行器需要从JavaConfig.class中加载配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutowiringConfig.class)
public class AutowiringTest {

    @Autowired
    private Food meat;

    @Autowired
    private People chinese;

    @Test
    public void meatShouldNotBeNull(){
        System.out.println("测试开始");
        assertNotNull(meat);
    }

    @Test
    public void peopleEatFood(){
        chinese.eat();
    }
}
