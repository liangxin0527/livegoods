package com.example.livegoods_backend_byhot;

import com.example.livegoods_backend_byhot.service.HotService;
import com.liangxin.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LivegoodsBackendByhotApplicationTests {

    @Autowired
    HotService hotService;
    @Test
    void contextLoads() {
        List<Product> list = hotService.findHotProduct("北京", 10);
        list.stream().forEach(name-> System.out.println(name));
    }

}
