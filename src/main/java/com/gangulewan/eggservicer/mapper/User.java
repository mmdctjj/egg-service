package com.gangulewan.eggservicer.mapper;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId
    private String code;
    private String useName;
    private String atort;
    private Long phone;
}
