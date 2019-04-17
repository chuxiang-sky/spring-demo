package com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.qualifier;

import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.interfaces.Dessert;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.qualifier.QualifierConfig;
import com.chuxiang.learn.spring.demo.bean.uniqueAutowiring.qualifier.annotation.Cooikes;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = QualifierConfig.class)
public class QualifierTest {

    //演示@Qualifier注解的第一种使用方式，参数中直接设置bean的ID
    @Autowired
    @Qualifier("cake")
    private Dessert dessert;


    //演示@Qualifier注解的第二种使用方式，参数中设置声明bean时，@Qualifier设置的自定义限定符
//    @Autowired
//    @Qualifier("cold")
//    private Dessert dessert1;

    //演示@Qualifier注解的第三种使用方式，创建自定义注解
    @Autowired
    @Cooikes
    private Dessert dessert1;
}
