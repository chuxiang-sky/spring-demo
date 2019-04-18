package com.chuxiang.learn.spring.mvc.services.impl;

import com.chuxiang.learn.spring.mvc.entities.User;
import com.chuxiang.learn.spring.mvc.repositories.UserRepository;
import com.chuxiang.learn.spring.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chuxiang_sky on 2019/04/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser(){
        return userRepository.getAllUser();
    }

    @Override
    public User getUserById(long id) {
        List<User> users = this.getAllUser();
        return users.stream().filter(user -> id==user.getId()).findFirst().get();
    }
}
