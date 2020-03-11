package com.example.livegoods_backend_search.service.impl;

import com.example.livegoods_backend_search.dao.ElasticSearchDao;
import com.example.livegoods_backend_search.dao.MongoDao;
import com.example.livegoods_backend_search.pojo.ESHouse;
import com.example.livegoods_backend_search.service.ImportService;
import com.liangxin.pojo.House;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImportServiceImpl implements ImportService {
    @Autowired
    private MongoDao mongoDao;
    @Autowired
    private ElasticSearchDao elasticSearchDao;


    @Override
    public boolean importDateToES() {
        boolean flag = this.elasticSearchDao.createIndexAndMapper(ESHouse.class);
        if(flag){
            List<House> list = this.mongoDao.selectHouseAll();
            List<IndexQuery> iq = new ArrayList<>();
            for(House house:list){
                ESHouse eh = new ESHouse();
                BeanUtils.copyProperties(house,eh);
                eh.setImg(house.getImgs()[0]);
                iq.add(new IndexQueryBuilder().withObject(eh).build());
            }
            this.elasticSearchDao.insertData(iq);
            return true;
        }
        return false;
    }
}
