package com.gangulewan.eggservicer.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gangulewan.eggservicer.mapper.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends BaseMapper<User> {

    boolean isRegister (Long phone);
}
