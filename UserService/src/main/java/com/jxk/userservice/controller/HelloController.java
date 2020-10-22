package com.jxk.userservice.controller;

import com.jxk.userservice.entity.User;
import com.jxk.userservice.listener.MyListener;
import com.jxk.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String helloToMyProject(String name){
        return "hello   "+name+  MyListener.a+"次";
    }
    @GetMapping("getAllUser")
    public Map<String ,Object> getAllUser(){
        Map<String,Object> userMap=new HashMap<>();
        List<User> allUser = userService.getAllUser();
        userMap.put("所有的用户",allUser);
        return userMap;
    }
}
