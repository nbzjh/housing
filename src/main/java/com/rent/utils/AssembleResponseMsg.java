package com.rent.utils;

import com.rent.po.InfoMsg;
import com.rent.po.ResponseBody;


/**
 * @ClassName AssembleResponseMsg
 * @Description TODO  封装ResponseBody内容
 * @author zjh
 * @create 2021-03-04 10:28
 **/

public class AssembleResponseMsg {

    /**
     * 成功返回内容
     * @author zjh
     * @Param [data]
     * @return com.rent.po.ResponseBody
     **/
    public <T>ResponseBody success(T data){
        ResponseBody<T> resp=new ResponseBody<T>();
        resp.setData(data);
        InfoMsg info=new InfoMsg();
        resp.setInfo(info);
        return resp;
    }

    /**
     * 失败/异常返回内容
     * @author zjh
     * @Param [status, errorCode, message]
     * @return com.rent.po.ResponseBody
     **/
    public <T> ResponseBody failure(int status, String errorCode, String message){
        ResponseBody<T> resp=new ResponseBody<T>();
        resp.setStatus(status);
        InfoMsg info=new InfoMsg();
        info.setCode(errorCode);
        info.setMessage(message);
        resp.setInfo(info);
        return resp;
    }
}
