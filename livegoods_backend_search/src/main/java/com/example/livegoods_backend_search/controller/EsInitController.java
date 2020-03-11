package com.example.livegoods_backend_search.controller;

import com.example.livegoods_backend_search.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsInitController {
    @Autowired
    private ImportService importService;
    @RequestMapping("/init")
    public Object init(){
        return this.importService.importDateToES();
    }

}
