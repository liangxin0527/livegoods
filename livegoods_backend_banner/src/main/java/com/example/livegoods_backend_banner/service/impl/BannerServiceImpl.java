package com.example.livegoods_backend_banner.service.impl;

import com.example.livegoods_backend_banner.dao.BannerDao;
import com.example.livegoods_backend_banner.service.BannerService;
import com.liangxin.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;
    @Override
    public List<Banner> findBannerAll() {
        return bannerDao.selectBannerAll();
    }
}
