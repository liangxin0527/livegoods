package com.example.livegoods_frontend_byrecommen.feign;

import com.liangxin.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecommendationServiceFeignClientFallback  implements RecommendationServiceFeignClient{
    @Override
    public List<Product> findRecommendation(String city, int size) {
        return new ArrayList<>();
    }
}
