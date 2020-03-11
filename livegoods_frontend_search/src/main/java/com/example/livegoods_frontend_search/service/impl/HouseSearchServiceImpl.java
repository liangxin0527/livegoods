package com.example.livegoods_frontend_search.service.impl;

import com.example.livegoods_frontend_search.feign.SearchServiceFeignClient;
import com.example.livegoods_frontend_search.service.HouseSearchService;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HouseSearchServiceImpl implements HouseSearchService {

    @Autowired
    private SearchServiceFeignClient searchServiceFeignClient;
    @Value("${fastdfs_host}")
    private String fastdfs_host;

    @Override
    public LiveGoodsResult houseSearch(String city, String keyword, int page, int size) {
        List<Map<String, Object>> list = searchServiceFeignClient.houseSearch(city, keyword, page, size);
        long count = this.searchServiceFeignClient.houseCount(city, keyword);
        for (Map<String, Object> map : list) {
            map.put("img",this.fastdfs_host+map.get("img"));
        }
        LiveGoodsResult result = new LiveGoodsResult();
        result.put("data",list);
        result.setStatus(200);
        long totalPage = count%size==0?count/size : count/size+1;
        result.put("hasMore",totalPage > page?true:false);
        return result;

    }
}
