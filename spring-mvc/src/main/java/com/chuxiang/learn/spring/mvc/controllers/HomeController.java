package com.chuxiang.learn.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chuxiang_sky on 2019/04/09.
 * 注解@Controller将该类声明为一个控制器，@Controller是一个构造型注解，基于@Component注解
 * 所以@Controller可以由@Component来替换，但是在表意性上，无法确定这个组件的类型
 *
 * 注解@RequestMapping可标注在类上和方法上，
 *  标注在类上时，其value属性值会应用到控制器的所有处理器方法（@RequestMapping标注的方法）上
 *  标注在方法上时，其value属性值会指定这个方法所要处理的请求路径
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable long id){
        System.out.println();
        return "home";
    }
}
