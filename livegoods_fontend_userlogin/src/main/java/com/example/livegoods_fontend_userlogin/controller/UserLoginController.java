package com.example.livegoods_fontend_userlogin.controller;

import com.example.livegoods_fontend_userlogin.service.UserLoginService;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/login")
    public Object login(Users users){
        return this.userLoginService.userLogin(users);
    }
}
