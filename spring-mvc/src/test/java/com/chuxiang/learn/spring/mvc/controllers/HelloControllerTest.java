package com.chuxiang.learn.spring.mvc.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by chuxiang_sky on 2019/04/15.
 */
public class HelloControllerTest {


    @Test
    public void homePageTest() throws Exception {
        HelloController homeController = new HelloController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();//搭建MockMvc
        mockMvc.perform(MockMvcRequestBuilders.get("/"))//对“/”执行get请求
                .andExpect(MockMvcResultMatchers.view().name("home"));//预期得到home视图
    }
}
