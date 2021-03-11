package com.rent.utils;

import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

/**
 * 字符串工具类
 * @ClassName StringUtil
 * @Description TODO
 * @author zjh
 * @create 2021-03-04 10:32
 */
public class StringUtil {
    /**
      * 浏览器和系统信息
      * @author zjh
      * @Param [request]
      * @return java.lang.String
      **/
    public static String getBrowserSystemInfo(HttpServletRequest request){
         UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("user-agent"));
         String BSInfo = userAgent.getOperatingSystem() + "-" + userAgent.getBrowser() + "(" + userAgent.getBrowserVersion() + ")";
         return BSInfo;
    }
}
