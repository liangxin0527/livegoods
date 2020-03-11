package com.example.livegoods_backend_search.dao;

import com.liangxin.pojo.Comment;

import java.util.List;

public interface CommentDao {

    List<Comment> selectCommentByHid(String hid,int page,int size);
    public long count(String hid);
}
