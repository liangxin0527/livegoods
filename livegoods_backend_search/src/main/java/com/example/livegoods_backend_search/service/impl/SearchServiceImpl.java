package com.example.livegoods_backend_search.service.impl;

import com.example.livegoods_backend_search.dao.ElasticSearchDao;
import com.example.livegoods_backend_search.pojo.ESHouse;
import com.example.livegoods_backend_search.service.SearchService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private ElasticSearchDao elasticSearchDao;


    @Override
    public long count(String city, String keyword) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        List<QueryBuilder> list = new ArrayList<>();
        list.add(QueryBuilders.matchPhraseQuery("city",city));
        list.add(QueryBuilders.matchQuery("title",keyword));
        boolQueryBuilder.must().addAll(list);
        SearchQuery searchQuery = new NativeSearchQuery(boolQueryBuilder);
        return this.elasticSearchDao.count(searchQuery,ESHouse.class);
    }


    @Override
    public List<ESHouse> search(String city, String keyword, int page, int size) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        List<QueryBuilder> list = new ArrayList<>();
        list.add(QueryBuilders.matchPhraseQuery("city",city));
        list.add(QueryBuilders.matchQuery("title",keyword));
        boolQueryBuilder.must().addAll(list);
        SearchQuery searchQuery = new NativeSearchQuery(boolQueryBuilder);
        searchQuery.setPageable(PageRequest.of(page,size));
        return this.elasticSearchDao.search(searchQuery,ESHouse.class);
    }
}

