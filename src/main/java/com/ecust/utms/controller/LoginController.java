package com.ecust.utms.controller;

import com.ecust.utms.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping("/login2")
    public String login2(){
        return "login2";
    }

   @PostMapping(value = "login")
    public String login(@RequestParam("userID") String userID, @RequestParam("inputPassword") String pwd,
                        @RequestParam("user") String usertype, Map<String,Object> map, HttpSession session){

        if("Student".equals(usertype)&&!StringUtils.isEmpty(userID)&&"1".equals(pwd)){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("loginuser",userID);
            return "redirect:/main_S.html";
        }
        else{
          map.put("msg","用户名密码错误");
        return "login";
       }
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "hello world";
    }





}
