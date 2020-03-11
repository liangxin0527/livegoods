package com.example.livegoods_frontend_search.feign;

import com.liangxin.pojo.Comment;
import com.liangxin.pojo.House;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "backendhousesearch",fallback = SearchServiceFeignClientFallback.class)
public interface SearchServiceFeignClient  {

    @RequestMapping("/house/search")
    List<Map<String,Object>> houseSearch(@RequestParam String city, @RequestParam String keyword, @RequestParam int page, @RequestParam int size);

    @RequestMapping("/house/count")
    public long houseCount(@RequestParam String city,@RequestParam String keyword);

    @RequestMapping("/details/findHouseById")
    House findHouseById(@RequestParam String id);
    @GetMapping("/comment/findCommentByHid")
    List<Comment> findCommentByHid(@RequestParam String hid, @RequestParam int page, @RequestParam int size);

    @GetMapping("/comment/count")
    long count(@RequestParam String hid);

}
