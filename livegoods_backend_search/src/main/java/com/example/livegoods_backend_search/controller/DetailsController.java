package com.example.livegoods_backend_search.controller;

import com.example.livegoods_backend_search.service.DetailService;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class DetailsController {
    @Autowired
    private DetailService detailsService;

    @RequestMapping("/findHouseById")
    public House findHouseById(String id){
        return this.detailsService.findHouseById(id);
    }
}
