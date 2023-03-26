package com.gangulewan.eggservicer.enums;

public enum ResponsedEnum {
    SUCCESS(200, "操作成功！"),
    ERROR(500, ""),
    AUTHERROR(403, "授权验证失败");

    private String msg;
    private Integer code;

    ResponsedEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }


    public Integer getCode() {
        return code;
    }

}
