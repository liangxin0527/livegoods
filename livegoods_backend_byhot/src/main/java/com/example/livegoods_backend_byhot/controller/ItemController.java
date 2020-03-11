package com.example.livegoods_backend_byhot.controller;

import com.example.livegoods_backend_byhot.service.HotService;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hot")
public class ItemController {

    @Autowired
    private HotService hotService;

    @RequestMapping("/findHotByCity")
    public List<Product> findHotByCity(String city, int size) {
        return this.hotService.findHotProduct(city, size);
    }
}
