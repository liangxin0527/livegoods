package com.example.livegoods_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RecommendationController {

    @RequestMapping("/recommendationFallback")
    public Map<String, Object> recommendationFallback(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("status",500);
        map.put("msg","请求失败了");
        return map;
    }
}
