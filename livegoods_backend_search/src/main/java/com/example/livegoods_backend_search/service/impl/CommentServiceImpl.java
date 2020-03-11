package com.example.livegoods_backend_search.service.impl;

import com.example.livegoods_backend_search.dao.CommentDao;
import com.example.livegoods_backend_search.service.CommentService;
import com.liangxin.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public List<Comment> findCommentByHid(String hid, int page, int size) {
        List<Comment> comments = this.commentDao.selectCommentByHid(hid, page, size);
        comments.stream().forEach(name-> System.out.println(name));
        return this.commentDao.selectCommentByHid(hid, page, size);
    }

    @Override
    public long count(String hid) {

        return this.commentDao.count(hid);
    }
}
