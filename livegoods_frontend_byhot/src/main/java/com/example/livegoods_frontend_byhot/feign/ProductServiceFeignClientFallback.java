package com.example.livegoods_frontend_byhot.feign;

import com.example.livegoods_frontend_byhot.service.ProductService;
import com.liangxin.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceFeignClientFallback implements ProductServcieFeignClient {


    @Override
    public List<Product> findHotByCity(String city, int size) {
        return new ArrayList<>();
    }
}
