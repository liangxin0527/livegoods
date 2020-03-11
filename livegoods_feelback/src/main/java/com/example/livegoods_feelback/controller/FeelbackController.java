package com.example.livegoods_feelback.controller;

import com.example.livegoods_feelback.service.FeelbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeelbackController {
    @Autowired
    private FeelbackService feelbackService;
    @PostMapping("/feelback")
    public Object feelback(String orderId,String feelback){
        return this.feelbackService.feelback(orderId, feelback);
    }
}
