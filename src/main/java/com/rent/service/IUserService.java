package com.rent.service;

import java.util.Map;

/**
 * @ClassName IUserService
 * @Description TODO 用户业务层接口
 * @author zjh
 * @create 2021-03-04 0:01
 */
public interface IUserService {
    Map<String,Object> queryUserList(Map<String, Object> map);

    int queryUser(Map<String, Object> map);
}
