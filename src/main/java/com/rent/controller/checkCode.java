package com.rent.controller;

import com.rent.utils.RandomValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zjh
 * @create 2021-03-10 14:40
 */
@Controller
public class checkCode {
    @RequestMapping(value="/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        System.out.println("-----------------------------------------------");
        response.setContentType("image/jpeg");
        HttpSession session = request.getSession();
        System.out.println(session);
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
             randomValidateCode.getRandomCode(request, response);
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
}
