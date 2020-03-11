package com.example.livegoods_frontend_search.controller;

import com.example.livegoods_frontend_search.service.CommentService;
import com.example.livegoods_frontend_search.service.DetailService;
import com.example.livegoods_frontend_search.service.HouseSearchService;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseSearchController {

    @Autowired
    private HouseSearchService houseSearchService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private DetailService detailService;

    @RequestMapping("/search")
    public Object houseSearch(@RequestParam(required = true) String city, @RequestParam(required = true) String content, @RequestParam(required = true) int page, @RequestParam(defaultValue = "3") int size) {
        return this.houseSearchService.houseSearch(city, content, page, size);
    }

    @GetMapping("/details")
    public Object houseDetails(@RequestParam(required = true) String id) {
        LiveGoodsResult houseByid = this.detailService.findHouseByid(id);
        //System.out.println(houseByid);
        return this.detailService.findHouseByid(id).getData();
    }

    @GetMapping("/comment")
    public Object findComment(@RequestParam(required = true) String id, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size) {
        return this.commentService.findCommentByHid(id, page, size);
    }
    @RequestMapping("/buytime")
    public Object findBuyTime(String id){
        return this.detailService.findByHouseTimeByid(id);
    }



}
