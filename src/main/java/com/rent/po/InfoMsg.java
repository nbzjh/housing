package com.rent.po;

import java.io.Serializable;

/**
 * @author zjh
 * @create 2021-03-04 10:38
 */


public class InfoMsg implements Serializable {
    //自定义错误码    默认0表示正常执行
     private String code="0";
     //错误信息
     private String message="操作成功";

     public String getCode() {
         return code;
     }

     public void setCode(String code) {
         this.code = code;
     }

     public String getMessage() {
         return message;
     }

     public void setMessage(String message) {
         this.message = message;
     }
}
