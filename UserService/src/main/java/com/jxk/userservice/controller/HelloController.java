package com.jxk.userservice.controller;

import com.jxk.userservice.listener.MyListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloToMyProject(String name){
        return "hello   "+name+  MyListener.a+"次";
    }
}
