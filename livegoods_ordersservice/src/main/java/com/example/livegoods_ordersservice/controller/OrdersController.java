
package com.example.livegoods_ordersservice.controller;

import com.example.livegoods_ordersservice.service.OrdersService;
import com.liangxin.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/addOrders")
    public String addOrders(@RequestBody Orders orders){
        this.ordersService.addOrders(orders);
        return "ok";
    }
}
