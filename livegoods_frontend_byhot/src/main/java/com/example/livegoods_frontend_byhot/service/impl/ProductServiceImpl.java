package com.example.livegoods_frontend_byhot.service.impl;

import com.example.livegoods_frontend_byhot.feign.ProductServcieFeignClient;
import com.example.livegoods_frontend_byhot.service.ProductService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductServcieFeignClient productServcieFeignClient;

    @Value("${fastdfs_host}")
    private String fastdfs_host;

    @Override
    public LiveGoodsResult findProductByCityAndSize(String city, int size) {
        List<Product> list = this.productServcieFeignClient.findHotByCity(city, size);

        for (Product product : list) {
            product.setImg(this.fastdfs_host+product.getImg());

        }
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        liveGoodsResult.setStatus(200);
        liveGoodsResult.put("data",list);
        return liveGoodsResult;
    }
}
