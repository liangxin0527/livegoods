package com.example.livegoods_house_buyaction.controller;

import com.example.livegoods_house_buyaction.service.BuyActionService;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyActionController {

    @Autowired
    private BuyActionService buyActionService;

    @RequestMapping("/buyaction")
    public Object buyaction(House house) {
        return this.buyActionService.buyaction(house);
    }
}

