package com.chuxiang.learn.spring.demo.bean.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by chuxiang_sky on 2019/04/03.
 */
@Component
public class Computer {

    private String type;
    private String brand;
    private Double price;

    //SpEL与属性占位符不同在于：
    // 1、SpEL不需要创建额外的bean，而属性占位符需要创建PropertySourcesPlaceholderConfigurer类型的bean
    // 2、要引用@PropertySource注解设置的属性源文件中的属性值时，SpEl使用#{environment['type']}，而属性占位符使用${type}
    // 3、当使用SpEL获取的属性值时，可以自动转换为接收的参数类型，而属性占位符只能获取到String类型的值
    public Computer(@Value("#{environment['type']}") String type, @Value("#{environment['brand']}") String brand, @Value("#{environment['price']}") Double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
