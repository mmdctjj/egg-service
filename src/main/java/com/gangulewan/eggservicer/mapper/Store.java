package com.gangulewan.eggservicer.mapper;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @TableId
    private String code;
    private String name;
    private String position;
    private Long phone;
    private String picList;
}
