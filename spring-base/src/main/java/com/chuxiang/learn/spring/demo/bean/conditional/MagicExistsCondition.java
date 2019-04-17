package com.chuxiang.learn.spring.demo.bean.conditional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by chuxiang_sky on 2019/04/02.
 * ConditionContext接口提供以下几种方法：
 * * BeanDefinitionRegistry getRegistry();可以用来检查bean定义
 * * ConfigurableListableBeanFactory getBeanFactory();检查bean是否存在，甚至探查bean的属性
 * * Environment getEnvironment();检查环境变量是否存在以及它的值
 * * ResourceLoader getResourceLoader();返回所加载的资源
 * * ClassLoader getClassLoader();检查类是否存在
 *
 * AnnotatedTypeMetadata能够检查带有@Bean注解的方法上还有什么其他的注解
 * * boolean isAnnotated(String var1);判断@Bean注解的方法是否有指定的注解
 * * Map<String, Object> getAnnotationAttributes(String var1);返回指定名称的所有注解
 * * Map<String, Object> getAnnotationAttributes(String var1, boolean var2);
 * * MultiValueMap<String, Object> getAllAnnotationAttributes(String var1);
 * * MultiValueMap<String, Object> getAllAnnotationAttributes(String var1, boolean var2);
 *
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().containsProperty("magic");
    }
}
