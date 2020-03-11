package com.example.livegoods_backend_search.service;

import com.example.livegoods_backend_search.pojo.ESHouse;

import java.util.List;

public interface SearchService {
    long count(String city,String keyword);
    List<ESHouse> search(String city, String keyword, int page, int size);

}
