package com.chuxiang.learn.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by chuxiang_sky on 2019/04/09.
 * 借助于Servlet 3规范和Spring 3.1 的功能增强，使用Java将DispatcherServlet配置在Servlet容器中。
 * 任何继承了AbstractAnnotationConfigDispatcherServletInitializer的类都会自动配置DispatcherServlet和Spring应用上下文
 * Spring应用的上下文会位于应用程序的Servlet上下文中
 * AbstractAnnotationConfigDispatcherServletInitializer剖析：
 *      在Servlet 3.0 环境中，容器会在类路径中查找实现了javax.servlet.ServletContainerInitializer接口的类，如果能发现的话，就会用来配置Servlet容器
 *      Spring提供了这个接口的实现，名为SpringServletContainerInitializer，这个类反过来又会查找实现WebApplicationInitializer的类并将配置的任务交给他们来完成
 *      Spring 3.2 引入了一个便利的WebApplicationInitializer基础实现，也就是AbstractAnnotationConfigDispatcherServletInitializer
 *      因为自定义的MyWebApplicationInitializer继承自AbstractAnnotationConfigDispatcherServletInitializer，同时也就实现了WebApplicationInitializer
 *      所以当部署到Servlet 3.0 容器中的时候，容器就会自动发现它，并用来配置Servlet上下文
 *
 * 为了理解getRootConfigClasses()和getServletConfigClasses()两个方法，需要先理解Servlet监听器（ContextLoaderListener）和DispatcherServlet的关系
 *      1、当DispatcherServlet启动时，它会创建Spring应用上下文，并加载配置文件或配置类中所声明的bean，
 *      getServletConfigClasses()方法中，要求DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类中的bean
 *      2、在Spring Web应用中，通常还会有另外一个应用上下文，是由ContextLoaderListener创建的
 *      3、一般来说，DispatcherServlet加载包含Web组件的bean，如控制器、视图解析器以及处理器映射，
 *      而ContextLoaderListener加载应用中其他的bean，这些bean通常是驱动应用后端的中间层和数据层组件。
 *      4、getServletConfigClasses()方法返回的带有@Configuration注解的类将会用来定义DispatcherServlet应用上下文中的bean
 *      5、getRootConfigClasses()方法返回的带有@Configuration注解的类将会用来配置COntextLoaderListener创建的应用上下文中的bean
 */
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //相当于web.xml配置中定义的ContextLoaderListener
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    //相当于web.xml配置中定义的DispatcherServlet
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    // 将一个或多个路径映射到DispatcherServlet上
    // 将DispatcherServlet映射到“/”
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
