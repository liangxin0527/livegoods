package com.example.livegoods_feelback.service;

import com.example.livegoods_feelback.dao.FeelbackDao;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeelbackServiceImpl implements FeelbackService {
    @Autowired
    private FeelbackDao feelbackDao;

    @Override
    public LiveGoodsResult feelback(String orderid, String feelback) {
        int index = this.feelbackDao.updateFeelbackById(orderid, feelback);
        LiveGoodsResult result = new LiveGoodsResult();
        if(index == 1){
            result.setStatus(200);
            result.put("msg","评论成功");
            return result;
        }
        result.setStatus(500);
        result.put("msg","评论失败");
        return result;
    }
}
