package com.chuxiang.learn.spring.mvc.controllers;

import com.chuxiang.learn.spring.mvc.entities.User;
import com.chuxiang.learn.spring.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chuxiang_sky on 2019/04/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "userInfo";
    }
}
