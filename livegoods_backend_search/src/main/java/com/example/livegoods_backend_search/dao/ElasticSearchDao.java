package com.example.livegoods_backend_search.dao;

import com.example.livegoods_backend_search.pojo.ESHouse;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import java.util.List;

public interface ElasticSearchDao {
    boolean createIndex(Class clazz);
    boolean putMapping(Class clazz);
    void insertData(List<IndexQuery> data);
    boolean createIndexAndMapper(Class clazz);
    List<ESHouse> search(SearchQuery query, Class clazz);
    long count(SearchQuery query, Class clazz);

}
