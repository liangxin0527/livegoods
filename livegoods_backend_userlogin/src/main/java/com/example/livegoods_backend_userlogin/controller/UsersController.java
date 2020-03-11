package com.example.livegoods_backend_userlogin.controller;

import com.example.livegoods_backend_userlogin.service.UsersService;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/insertUsers")
    public int insertUsers(@RequestBody Users users){
        return this.usersService.insert(users);
    }
    @RequestMapping("/findUserByName")
    public Users findUserByName(String username){
        return this.usersService.selectByUsername(username);
    }
}
