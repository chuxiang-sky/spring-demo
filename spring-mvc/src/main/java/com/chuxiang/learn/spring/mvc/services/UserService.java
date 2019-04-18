package com.chuxiang.learn.spring.mvc.services;

import com.chuxiang.learn.spring.mvc.entities.User;

import java.util.List;

/**
 * Created by chuxiang_sky on 2019/04/18.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserById(long id);
}
