package com.example.livegoods_backend_search.service;

import com.liangxin.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findCommentByHid(String hid, int page, int size);
    long count(String hid);

}
