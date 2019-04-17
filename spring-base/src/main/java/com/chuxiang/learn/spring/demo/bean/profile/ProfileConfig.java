package com.chuxiang.learn.spring.demo.bean.profile;

import com.chuxiang.learn.spring.demo.bean.profile.interfaces.IEnvironment;
import com.chuxiang.learn.spring.demo.bean.profile.interfaces.impl.DevelopmentEnvironment;
import com.chuxiang.learn.spring.demo.bean.profile.interfaces.impl.ProductionEnvironment;
import com.chuxiang.learn.spring.demo.bean.profile.interfaces.impl.TestingEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * Created by chuxiang_sky on 2019/04/01.
 * 配置profile bean
 * 针对于不同运行环境创建不同类型的bean，在Java配置中，可以用@Profile注解指定某个bean属于哪一个profile
 * 注解@Profile可作用在类和方法上
 * 1、@Profile注解应用在类级别时，同时该类需要@Configuration注解标注，该配置类中所有创建的bean都属于这个指定的profile
 * 2、@Profile注解应用在方法级别时，同时该类需要@Bean注解标注，表示该方法创建的bean属于仅属于这个指定的profile
 * 当指定的profile被激活时，被这个profile标注的bean才会被创建
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Spring确定哪个profile处于激活状态时，需要依赖两个独立的属性：spring.profiles.active和spring.profiles.default
 * 如果设置了spring.profiles.active属性的话，其属性值就会用来确定哪个profile是激活的；
 * 当没有设置pring.profiles.active属性的话，那Spring就会查找spring.profiles.default的值；
 * 如果以上两个属性都没有设置的话，那就没有激活的profile，因此Spring只会创建那些没有定义在profile中的bean
 *
 * 有多种方式来设置这两个属性值：
 * 1、作为DispatcherServlet的初始化参数
 *      在web.xml中为Servlet设置默认的profile
 *      <servlet>
 *          <servlet-name></servlet-name>
 *          <servlet-class></servlet-class>
 *          <init-param>
 *              <param-name>spring.profiles.default</param-name>
 *              <param-value>dev</param-value>
 *          </init-param>
 *      </servlet>
 * 2、作为Web应用上下文参数
 *      在web.xml中为上下文设置默认的profile
 *      <context-param>
 *          <param-name>spring.profiles.default</param-name>
 *          <param-value>dev</param-value>
 *      </context-param>
 * 3、作为JNDI条目
 * 4、作为环境变量
 * 5、作为JVM的系统属性
 * 6、在集成测试类使用@ActiveProfiles注解设置
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 从Spring 4开始，@Profile注解进行了重构，使其基于@Conditional注解和Condition实现
 *
 *
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public IEnvironment devEnv4Java(){
        return new DevelopmentEnvironment();
    }
    @Bean
    @Profile("test")
    public IEnvironment testEnv4Java(){
        return new TestingEnvironment();
    }
    @Bean
    @Profile("prod")
    public IEnvironment prodEnv4Java(){
        return new ProductionEnvironment();
    }
}
