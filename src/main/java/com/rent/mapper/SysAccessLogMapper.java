package com.rent.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author zjh
 * @create 2021-03-04 10:45
 */
public interface SysAccessLogMapper {
    /**
      * 查询系统日志列表
      * @Author zjh
      * @Param [map]
      * @return java.util.Map<java.lang.String,java.lang.Object>
      **/
     public List<Map<String,Object>> querySysLogList(Map<String, Object> map);

     /**
       * 保存日志
       * @Author zjh
       * @Param [map]
       * @return int
      * **/
     public int saveSysLog(Map<String, Object> map);
}
