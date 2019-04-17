package com.chuxiang.learn.spring.demo.bean.config.autowiring;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/03/28.
 * @Component注解 ：表明Spring需要为该类创建bean，
 *      1、若没有设置属性值，则会默认以类名首字母小写作为bean的ID；
 *      2、若需要明确设置ID，则可以@Component("xxx")
 *      3、可以用Java依赖规范中的@Named替换
 * @Autowired注解 ：
 *      1、可以用在属性、构造器和属性的setter方法或类中其它方法上；
 *      2、如果没有匹配的bean，会在Spring上下文创建的时候，抛出异常
 *      为了避免异常的出现，可以将@Autowired的required属性设置为false，@Autowired(required=false)；
 *      3、如果有多个bean都能满足依赖关系的话，Spring也会抛出一个异常，需要解决自动装配中的歧义性
 *      4、可以用Java依赖规范中的@Injected替换
 */
@Component
public class Chinese implements People {

    @Autowired
    private Food food;

//    @Autowired
//    public Chinese(Food food) {
//        this.food = food;
//    }

//    @Autowired
//    public void setFood(Food food) {
//        this.food = food;
//    }


    @Override
    public void eat() {
        System.out.println("Chinese like eating "+food.showType());
    }
}
