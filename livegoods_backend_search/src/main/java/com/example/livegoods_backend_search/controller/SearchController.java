package com.example.livegoods_backend_search.controller;

import com.example.livegoods_backend_search.pojo.ESHouse;
import com.example.livegoods_backend_search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public List<ESHouse> houseSearch(String city, String keyword, int page, int size){
        return this.searchService.search(city, keyword, page, size);
    }

    @RequestMapping("/count")
    public long houseCount(String city,String keyword){
        return this.searchService.count(city, keyword);
    }
}
