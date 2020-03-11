package com.example.livegoods_backend_byhot.service.impl;

import com.example.livegoods_backend_byhot.dao.LivegoodsByhotServcie;
import com.example.livegoods_backend_byhot.service.HotService;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostSercviceImpl implements HotService {

    @Autowired
    private LivegoodsByhotServcie livegoodsByhotServcie;
    public List<Product> findHotProduct(String city, int size){
        return this.livegoodsByhotServcie.selectHotByCity(city,size);
    }
}
