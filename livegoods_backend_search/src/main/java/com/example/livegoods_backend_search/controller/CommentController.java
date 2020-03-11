package com.example.livegoods_backend_search.controller;

import com.example.livegoods_backend_search.service.CommentService;
import com.liangxin.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/findCommentByHid")
    public List<Comment> findCommentByHid(String hid, int page, int size){
        return  this.commentService.findCommentByHid(hid, page, size);
    }

    @RequestMapping("/count")
    public long count(String hid){
        return  this.commentService.count(hid);
    }
}
