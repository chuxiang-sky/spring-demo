package com.chuxiang.learn.spring.demo.aop.declareParents;

import com.chuxiang.learn.spring.demo.aop.declareParents.interfaces.Bird;
import com.chuxiang.learn.spring.demo.aop.declareParents.interfaces.impl.Eagle;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/07.
 */
@Component
@Aspect
public class AspectConfig {

    //@DeclareParents注解由三部分组成
    //  value属性指定了那种类型的bean要引入该接口，标记符号后面的加号表示是People的所有子类型，而不是People本身
    //  defaultImpl属性指定了为引入功能提供实现的类
    //  注解所标注的属性指明了要引入的接口
    @DeclareParents(value="com.chuxiang.learn.spring.demo.aop.declareParents.bean.People+",defaultImpl = Eagle.class)
    public Bird bird;
}
