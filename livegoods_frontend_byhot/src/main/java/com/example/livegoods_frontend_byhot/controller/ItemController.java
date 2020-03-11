package com.example.livegoods_frontend_byhot.controller;

import com.example.livegoods_frontend_byhot.service.ProductService;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ProductService productService;

    @RequestMapping("hotProduct")
    public LiveGoodsResult findHotProduct(String city,@RequestParam(defaultValue = "8") int size){
        return this.productService.findProductByCityAndSize(city,size);

    }
}
