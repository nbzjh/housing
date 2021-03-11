package com.rent.mapper;

import com.rent.po.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserMapper
 * @Description TODO 用户持久层接口
 * @author zjh
 * @create 2021-03-03 23:52
 */
public interface UserMapper {
    List<User> queryUserList(Map<String, Object> map);

    //查询用户
    int queryUser(Map<String, Object> map);
}
