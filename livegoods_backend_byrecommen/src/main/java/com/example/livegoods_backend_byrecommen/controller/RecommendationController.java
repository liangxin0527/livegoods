package com.example.livegoods_backend_byrecommen.controller;

import com.example.livegoods_backend_byrecommen.service.RecommendationService;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @RequestMapping("/findRecommendation")
    public List<Product> findRecommendation(String city,int size){
        return this.recommendationService.findProductRecommendation(city,size);
    }
}
