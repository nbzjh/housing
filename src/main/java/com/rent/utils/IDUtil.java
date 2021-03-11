package com.rent.utils;

import java.util.UUID;

/**
 * @author zjh
 * @create 2021-03-04 10:31
 */
public class IDUtil {
    /**
      * 获取uuid（以去掉'-'字符）
      * @author zjh
      * @Param []
      * @return java.lang.String
      **/
     public static String getUUID(){
         return UUID.randomUUID().toString().replace("-", "");
     }
}
