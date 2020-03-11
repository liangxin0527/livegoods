package com.example.livegoods_frontend_byhot.feign;

import com.liangxin.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="backendbyhostserver",fallback = ProductServiceFeignClientFallback .class)
public interface ProductServcieFeignClient {
    @RequestMapping("/hot/findHotByCity")
    List<Product> findHotByCity(@RequestParam String city, @RequestParam int size);
}
