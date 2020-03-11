package com.example.livegoods_frontend_byrecommen.feign;

import com.liangxin.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "backendbyrecommenserver",fallback = RecommendationServiceFeignClientFallback.class)
public interface RecommendationServiceFeignClient {

    @RequestMapping("/recommendation/findRecommendation")
    public List<Product>  findRecommendation(@RequestParam String city,@RequestParam int size);
}
