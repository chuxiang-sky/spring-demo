package com.chuxiang.learn.spring.demo.bean.config.javaConfig;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import com.chuxiang.learn.spring.demo.bean.config.interfaces.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chuxiang_sky on 2019/03/28.
 * 显示配置：
 *      当某些组件，比如第三方库中的组件，不能在类中添加@Component和@Autowired注解时，自动装配的方案就行不通了。
 * 此时必须采用显示装配的方式，显示装配又分为Java和XML两种。
 *      其中，JavaConfig会比XML方式更好，原因在于JavaConfig更为强大、类型安全并且对重构友好。
 *      尽管JavaConfig与其他组件采用同一种编程语言，但它是配置代码，意味着它不应该包含任何业务逻辑，不该侵入到业务逻辑之中，
 * 通常会将JavaConfig放到单独的包中，使它与其他的应用程序逻辑分离开来。
 *      仅使用@Configuration注解就可以标注一个类为配置类，应该包含了Spring应用上下文创建bean的细节。
 *      在JavaConfig配置类中声明bean可以采用如下方式：
 *      ——用@Bean 注解标注一个创建所需类型实例的方法，
 *          @Bean 注解会告诉Spring这个方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean，
 *          默认情况下，bean的ID与带有@Bean注解的方法名是一样的，如果需要指定名称，可设置@Bean注解的name属性值
 *      @Bean 注解和@Component注解的区别：
 *          @Bean 注解是一个方法级别的注解，一般用在@Configuration注解标注的配置类中的方法上，用来声明bean；
 *          @Component 注解是一个类级别的注解，一般用在类上用来声明bean，组合@ComponentScan注解使用
 * 混合配置：
 *      1、JavaConfig中引入其他的JavaConfig
 *          可以在一个JavaConfig中通过@Import注解将另外一个JavaConfig组合起来，示例如下：
 *          @Import({XxxConfig.class,YyyConfig.class})
 *      2、JavaConfig中引入XML配置
 *          可以在一个JavaConfig中通过@ImportResource注解将一个XML配置组合起来，示例如下：
 *          @ImportResource({"classpath:spring-config.xml","classpath:spring-xxx.xml"})
 *
 */
@Configuration
public class JavaConfig {

    //带@Bean注解的方法，可以采用任何必要的Java功能来产生bean实例
    @Bean
    public Food beef(){
        return new Beef();
    }

    //通过JavaConfig实现注入的方式有三种方式
    //方式一：引用创建bean的方法，调用需要传入Food对象的构造器来创建People实例
//    @Bean
//    public People american(){
//        return new American(beef());//bean的默认作用域是单例的，beef()只会返回同一个实例对象
//    }
    //方式二：将需要依赖的对象作为创建bean的方法的参数
    //        当创建bean的时候，将该参数传入创建bean的构造器中
    @Bean
    public People american(Food food){
        return new American(food);//需要American类包含一个显示的构造器
    }
    //方式三：将需要依赖的对象作为创建bean的方法的参数
    //        当创建bean的时候，将该参数传入bean实例对象的setter方法中
//    @Bean
//    public People american(Food food){
//        American american = new American();//需要American类包含一个默认无参构造器
//        american.setFood(food);//需要American类有setter方法
//        return american;
//    }
}
