package com.chuxiang.learn.spring.demo.bean.spel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chuxiang_sky on 2019/04/03.
 * 当使用SpEL的方式注入属性值时，与使用属性占位符PropertyPlaceholder不同的是，不需要创建PropertySourcesPlaceholderConfigurer类型的bean
 * 在使用方式上，两者都是使用@Value注解，但另外一个区别就是假设属性资源文件中定义了name=chuxiang
 * 属性占位符是@Value("${name")
 * 而SpEL是@Value("#{environment['name']}")
 * 原因是在使用@PropertySource注解时，设置的资源文件是创建了一个Environment对象中
 *
 *
 * SpEL除了能够代替属性占位符的作用，还有其他作用：
 * 1、字面量：能表示整型、浮点型、布尔型和String类型的字面量
 *          #{1314}、#{13.14}、#{false}、#{'Hello World'}
 * 2、引用bean、属性和方法（以本例中的computer这个bean说明）
 *          #{computer}、#{computer.name}、#{computer.toString()}
 * 3、使用类作用域的方法和常量：要依赖T()这个关键字
 *          #{T(java.lang.Math).PI}、#{T(System).currentTimeMillis()}
 * 4、使用运算符
 *          算术运算：+、-、*、/、%、^
 *          比较运算：<、>、==、<=、=>、lt、gt、eq、le、ge
 *          逻辑运算：and、or、not、|
 *          条件运算：?:(ternary)、?:(Elvis)
 *          正则表达式：matches
 * 5、集合
 */
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpELConfig {
}
