package com.chuxiang.learn.spring.demo.bean.placeholder;

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

    //// @Value注解从Spring Environment中获取的属性值都是String类型
    public Computer(@Value("${type}") String type, @Value("${brand}") String brand, @Value("${price}") String price) {
        this.type = type;
        this.brand = brand;
        this.price = Double.parseDouble(price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
