package com.rent.po;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO  用户类
 * @author zjh
 * @create 2021-03-03 23:54
 */
public class User implements Serializable {
    private String uid; //uid
    private String userName; //用户名
    private String password; //密码
    private String name; //姓名
    private Integer age; //年龄
    private Integer sex; //性别

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    @Override
     public String toString() {
         return "User{" +
                 "uid='" + uid + '\'' +
                 ", userName='" + userName + '\'' +
                 ", password='" + password + '\'' +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 ", sex=" + sex +
                 '}';
     }
}
