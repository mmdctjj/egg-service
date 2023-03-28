package com.gangulewan.eggservicer.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Integral {
    private Long loginTime;
    private String code;
    private String OpenId;
}
