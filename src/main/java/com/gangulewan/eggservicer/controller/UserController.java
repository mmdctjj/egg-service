package com.gangulewan.eggservicer.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gangulewan.eggservicer.mapper.User;
import com.gangulewan.eggservicer.service.UserService;
import com.gangulewan.eggservicer.utils.Responsed;
import com.gangulewan.eggservicer.utils.ResponsedUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Responsed login (User user) {

        QueryWrapper wrapper = new QueryWrapper();

        wrapper.eq("phone", user.getPhone());

        Long count = userService.selectCount(wrapper);

        if (count == 0) {userService.insert(user);}

        return ResponsedUtil.success();
    }
}
