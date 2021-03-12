package com.rent.controller;

import com.alibaba.fastjson.JSONObject;
import com.rent.utils.AssembleResponseMsg;
import com.rent.po.ResponseBody;
import com.rent.service.IUserService;
import com.rent.utils.RandomValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO 用户控制层
 * @author zjh
 * @create 2021-03-03 23:46
 */
@RestController
public class UserController {
     @Autowired
     private IUserService userService;

     @RequestMapping(value = "/queryUserList",produces = "application/json;charset=utf-8")
     public ResponseBody queryUserList(@RequestBody Map<String,Object> map){
         Map<String, Object> resultMap = userService.queryUserList(map);
         return new AssembleResponseMsg().success(resultMap);
     }
     @RequestMapping(value = "/login",produces = "application/json;charset=utf-8")
     public ResponseBody Login(@RequestBody Map<String,Object> map,
                               HttpServletRequest request)
     {
         HttpSession session = request.getSession();
         String  checkCode = map.get("checkCode").toString();
         //System.out.println(session.getAttribute( RandomValidateCode.RANDOMCODEKEY));
         if(!session.getAttribute(RandomValidateCode.RANDOMCODEKEY).equals(checkCode)) {
             return new AssembleResponseMsg().failure(200,"error","验证码错误");
         }

         System.out.println(map);
//         Map<String,Object> map = new HashMap<String,Object>();
//         map.put("userName",userName);
//         map.put("password",password);
         int flag = userService.queryUser(map);
         if (flag==1){
             System.out.println(new AssembleResponseMsg().success("OK"));
             return new AssembleResponseMsg().success("OK");
         } {
             System.out.println(new AssembleResponseMsg().failure(200,"error","用户名或密码错误"));
             return new AssembleResponseMsg().failure(200,"error","用户名或密码错误");
        }
     }

}
