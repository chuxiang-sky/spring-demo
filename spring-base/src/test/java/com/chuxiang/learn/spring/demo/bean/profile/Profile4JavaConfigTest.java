package com.chuxiang.learn.spring.demo.bean.profile;

import com.chuxiang.learn.spring.demo.bean.profile.ProfileConfig;
import com.chuxiang.learn.spring.demo.bean.profile.interfaces.IEnvironment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chuxiang_sky on 2019/04/01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileConfig.class)
@ActiveProfiles("dev")
public class Profile4JavaConfigTest {

    @Autowired
    private IEnvironment env;

    @Test
    public void getEnv(){
        env.showEnvironmentInfo();
    }
}
