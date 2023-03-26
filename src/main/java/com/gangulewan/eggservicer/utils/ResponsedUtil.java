package com.gangulewan.eggservicer.utils;

import com.gangulewan.eggservicer.enums.ResponsedEnum;

public class ResponsedUtil {

    public static Responsed success() {
        Responsed responsed = new Responsed();

        responsed.setCode(ResponsedEnum.SUCCESS.getCode());
        responsed.setMsg(ResponsedEnum.SUCCESS.getMsg());

        return responsed;
    }

    public static <T> Responsed success (T data) {
        Responsed responsed = success();
        responsed.setData(data);

        return responsed;
    }

    public static Responsed success (String msg) {
        Responsed responsed = success();
        responsed.setMsg(msg);

        return responsed;
    }

    public static <T> Responsed success (T data, String msg) {
        Responsed responsed = success();

        responsed.setMsg(msg);
        responsed.setData(data);

        return responsed;
    }

    public static <T> Responsed success (T data, String msg, Integer code) {
        Responsed responsed = success();

        responsed.setData(data);
        responsed.setCode(code);
        responsed.setMsg(msg);

        return responsed;
    }
}
