package com.chuxiang.learn.spring.mvc.controllers;

import com.chuxiang.learn.spring.mvc.config.MyWebApplicationInitializer;
import com.chuxiang.learn.spring.mvc.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by chuxiang_sky on 2019/04/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyWebApplicationInitializer.class)
public class HomeControllerTest {

    @Autowired
//    HomeController homeController;

    @Test
    public void homePageTest() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();//搭建MockMvc
        mockMvc.perform(MockMvcRequestBuilders.get("/"))//对“/”执行get请求
                .andExpect(MockMvcResultMatchers.view().name("home"));//预期得到home视图
    }
}
