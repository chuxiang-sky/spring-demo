package com.chuxiang.learn.spring.mvc.repositories;

import com.chuxiang.learn.spring.mvc.entities.User;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chuxiang_sky on 2019/04/18.
 */
@Repository
public class UserRepository {

    private List<User> users;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public UserRepository() throws ParseException {
        this.users = new ArrayList<User>(){
            {
                add(new User.UserBuilder(1,"chuxiang").setAge(18).setGender(true).setBirthday(sdf.parse("1989-08-16")).build());
                add(new User.UserBuilder(2,"lixue").setAge(18).setGender(false).setBirthday(sdf.parse("1990-02-01")).build());
            }
        };
    }

    public List<User> getAllUser(){
        return users;
    }
}
