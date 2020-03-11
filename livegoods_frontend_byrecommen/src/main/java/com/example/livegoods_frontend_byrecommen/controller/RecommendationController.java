package com.example.livegoods_frontend_byrecommen.controller;

import com.example.livegoods_frontend_byrecommen.service.RecommendationService;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

   @Autowired
    private RecommendationService recommendationService;

   @RequestMapping("/recommendation")
   public LiveGoodsResult findProductByCommendation(String city, @RequestParam(defaultValue = "4") int size){
       return this.recommendationService.findProductByRecommendation(city,size);
   }
}
