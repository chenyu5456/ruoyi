package com.ruoyi.common.utils;

import java.util.UUID;

/**
 * @Author: ChenYu
 * @Date: 2019/3/27 10:54
 * @Description:
 */
public class UUIDUtils {
    public static String createUUID(){
        String result = UUID.randomUUID().toString().replace("-", "");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(createUUID());
    }
}
