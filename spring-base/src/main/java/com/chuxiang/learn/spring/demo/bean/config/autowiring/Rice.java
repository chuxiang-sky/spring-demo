package com.chuxiang.learn.spring.demo.bean.config.autowiring;

import com.chuxiang.learn.spring.demo.bean.config.interfaces.Food;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/03/28.
 */
@Component
public class Rice implements Food {
    @Override
    public String showType() {
        return "rice";
    }
}
