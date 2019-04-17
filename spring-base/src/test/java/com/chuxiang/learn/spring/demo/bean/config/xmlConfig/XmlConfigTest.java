package com.chuxiang.learn.spring.demo.bean.config.xmlConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/03/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/bean/spring-config.xml")
public class XmlConfigTest {

    @Autowired
    private Food sushi;

    @Autowired
    private People japanese;

    @Autowired
    private People japanese4c;

    @Autowired
    private People japanese4c1;

    @Autowired
    private People korean;

    @Autowired
    private People korean4c;

    @Autowired
    private People korean4c1;

    @Autowired
    private People indian;

    @Autowired
    private People japanese4p;

    @Test
    public void testXmlConfig(){
        japanese.eat();
        japanese4c.eat();
        japanese4c1.eat();
        korean.eat();
        korean4c.eat();
        korean4c1.eat();
        indian.eat();
        japanese4p.eat();
    }
}
