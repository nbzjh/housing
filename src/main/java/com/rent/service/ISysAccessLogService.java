package com.rent.service;

import java.util.Map;

/**
 * @author zjh
 * @create 2021-03-04 10:44
 */
public interface ISysAccessLogService {
/**
 * 查询系统日志列表
 * @author zjh
 * @Param [map]
 * @return java.util.Map<java.lang.String,java.lang.Object>
 **/
      public Map<String,Object> querySysLogList(Map<String, Object> map);

     /**
      * 保存日志
      * @author zjh
      * @Param [map]
      * @return int
      **/
     public int saveSysLog(Map<String, Object> map);
}
