package com.rent.controller;

import com.rent.utils.AssembleResponseMsg;
import com.rent.po.ResponseBody;
import com.rent.service.ISysAccessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

 /**
  * 系统访问日志Controller
  * @ClassName SysAccessLogController
  * @Description TODO
  * @Author zjh
  * @create 2021-03-03 23:42
  **/
 @RestController
 public class SysAccessLogController {
     @Autowired
     private ISysAccessLogService sysAccessLogService;

     /**
      * 查询系统访问日志列表
      * @Author zjh
      * @Param [map]
      * @return com.rent.po.ResponseInfo
      **/
     @RequestMapping(value = "/sysLogList",produces = "application/json;charset=utf-8")

     public ResponseBody querySysLogList(@RequestBody Map<String,Object> map){
         Map<String, Object> resultMap = sysAccessLogService.querySysLogList(map);
         return new AssembleResponseMsg().success(resultMap);
     }
}
