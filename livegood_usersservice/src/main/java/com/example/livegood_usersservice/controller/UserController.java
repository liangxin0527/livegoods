package com.example.livegood_usersservice.controller;

import com.example.livegood_usersservice.service.UsersService;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/insertUsers")
    public String addUsers(@RequestBody Users users){
        this.usersService.addUsers(users);
        return "OK";
    }
}

