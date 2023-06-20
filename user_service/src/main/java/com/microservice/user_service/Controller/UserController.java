package com.microservice.user_service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.user_service.Entity.User;
import com.microservice.user_service.Service.UserService;

@RestController
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/{userID}" , method = RequestMethod.GET)
    public User getUser(@PathVariable("userID") Long userId){
        return userService.getUser(userId);
    }

}
