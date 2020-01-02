package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class UserController {

    @RequestMapping("test1")
    public  Object test(){
        return "ok";
    }
}