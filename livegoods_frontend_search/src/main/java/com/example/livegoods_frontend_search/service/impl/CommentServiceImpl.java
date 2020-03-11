package com.example.livegoods_frontend_search.service.impl;

import com.example.livegoods_frontend_search.feign.SearchServiceFeignClient;
import com.example.livegoods_frontend_search.service.CommentService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private SearchServiceFeignClient searchServiceFeignClient;

    @Override
    public LiveGoodsResult findCommentByHid(String hid, int page, int size) {
        List<Comment> commentByHid = searchServiceFeignClient.findCommentByHid(hid, page, size);
        long count = searchServiceFeignClient.count(hid);
        commentByHid.stream().forEach(name-> System.out.println(name));
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        liveGoodsResult.setStatus(200);
        liveGoodsResult.put("data",commentByHid);
        long tatalPage = count%size==0?count/size:count/size+1;
        liveGoodsResult.put("hasMore",tatalPage>page?true:false);
        return liveGoodsResult;
    }
}
