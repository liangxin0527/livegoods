package com.example.livegoods_frontend_search.service;

import com.liangxin.commons.LiveGoodsResult;

public interface CommentService {
    LiveGoodsResult findCommentByHid(String hid, int page, int size);
}
