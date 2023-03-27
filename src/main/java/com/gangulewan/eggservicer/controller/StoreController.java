package com.gangulewan.eggservicer.controller;

import com.gangulewan.eggservicer.mapper.Store;
import com.gangulewan.eggservicer.service.StoreService;
import com.gangulewan.eggservicer.utils.Responsed;
import com.gangulewan.eggservicer.utils.ResponsedUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("/register")
    public Responsed register (Store store) {

        int i = storeService.insert(store);

        if (i == 0) {
            return ResponsedUtil.success(200 );
        } else {
            return ResponsedUtil.success(500, "122", 500);
        }

    }
}
