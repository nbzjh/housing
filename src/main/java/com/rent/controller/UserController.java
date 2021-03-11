package com.rent.controller;

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
     @RequestMapping(value = "/login")
     public ResponseBody Login(@RequestParam(value = "userName", required = false) String userName,
                                   @RequestParam(value = "password", required = false) String password,
                                   @RequestParam(value = "checkCode", required = false) String code,
                                   HttpServletRequest request
     ){

//         HttpSession session = request.getSession();
//         System.out.println(code);
//         //System.out.println(session.getAttribute( RandomValidateCode.RANDOMCODEKEY));
//         if(session.getAttribute( RandomValidateCode.RANDOMCODEKEY).equals(code)) {
////System.out.println("code 有问题");
//             return new AssembleResponseMsg().failure(200,"error","验证码错误");
//         }
         System.out.println(userName);
         System.out.println(password);
         Map<String,Object> map = new HashMap<String,Object>();
         map.put("userName",userName);
         map.put("password",password);
         int flag = userService.queryUser(map);
         if (flag==1){
             System.out.println("OK");
             return new AssembleResponseMsg().success("OK");
         } {
             return new AssembleResponseMsg().failure(200,"error","用户名或密码错误");
        }
     }

}
