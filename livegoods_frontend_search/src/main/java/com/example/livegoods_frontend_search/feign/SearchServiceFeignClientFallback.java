package com.example.livegoods_frontend_search.feign;

import com.liangxin.pojo.Comment;
import com.liangxin.pojo.House;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class SearchServiceFeignClientFallback implements SearchServiceFeignClient{
    @Override
    public List<Map<String, Object>> houseSearch(String city, String keyword, int page, int size) {
        return new ArrayList<>();
    }

    @Override
    public long houseCount(String city, String keyword) {
        return 0;
    }
    @Override
    public House findHouseById(String id) {
        return null;
    }

    @Override
    public List<Comment> findCommentByHid(String hid, int page, int size) {
        return new ArrayList<>();
    }

    @Override
    public long count(String hid) {
        return 0;
    }
}
