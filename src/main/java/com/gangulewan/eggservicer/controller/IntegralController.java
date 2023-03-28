package com.gangulewan.eggservicer.controller;

import com.gangulewan.eggservicer.mapper.Integral;
import com.gangulewan.eggservicer.service.IntegralService;
import com.gangulewan.eggservicer.service.UserService;
import com.gangulewan.eggservicer.utils.Responsed;
import com.gangulewan.eggservicer.utils.ResponsedUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/integral")
public class IntegralController {

    @Autowired(required = false)
    IntegralService integralService;

    @GetMapping("/add")
    public Responsed add () {

        Integral integral = new Integral();

        integralService.insert(integral);

        return ResponsedUtil.success();
    }

    @GetMapping("/list")
    public Responsed getIntegralService() {

        List<Integral> integrals = integralService.selectList(null);

        return ResponsedUtil.success(integrals);
    }
}
