package com.example.livegoods_house_buyaction.controller;

import com.example.livegoods_house_buyaction.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public Object findOrder(String user){
        return this.orderService.findOrders(user).get("data");
    }
}
