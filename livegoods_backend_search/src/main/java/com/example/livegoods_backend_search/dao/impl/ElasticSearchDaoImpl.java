package com.example.livegoods_backend_search.dao.impl;

import com.example.livegoods_backend_search.dao.ElasticSearchDao;
import com.example.livegoods_backend_search.dao.MongoDao;
import com.example.livegoods_backend_search.pojo.ESHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ElasticSearchDaoImpl implements ElasticSearchDao {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public boolean createIndex(Class clazz) {


        return this.elasticsearchTemplate.createIndex(clazz);
    }

    @Override
    public boolean putMapping(Class clazz) {
        return this.elasticsearchTemplate.putMapping(clazz);
    }

    @Override
    public void insertData(List<IndexQuery> data) {
        this.elasticsearchTemplate.bulkIndex(data);
    }

    @Override
    public boolean createIndexAndMapper(Class clazz) {
        boolean flag = this.createIndex(clazz);
        boolean flag2 = this.putMapping(clazz);

        if (flag && flag2) {
            return true;
        }
        return false;
    }

    @Override
    public List<ESHouse> search(SearchQuery query, Class clazz) {


        return this.elasticsearchTemplate.queryForList(query,clazz);
    }

    @Override
    public long count(SearchQuery query, Class clazz) {
        return this.elasticsearchTemplate.count(query,clazz);
    }
}
