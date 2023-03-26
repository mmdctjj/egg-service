package com.gangulewan.eggservicer.controller;

import com.gangulewan.eggservicer.utils.Responsed;
import com.gangulewan.eggservicer.utils.ResponsedUtil;
import com.gangulewan.eggservicer.vo.LoginParams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1")
public class Index {

    @GetMapping("/ping")
    public Responsed hello() {

        return ResponsedUtil.success("content successful!");
    }

    @PostMapping("/login")
    public Responsed Login (LoginParams loginParams) {

        return ResponsedUtil.success();
    }
}
