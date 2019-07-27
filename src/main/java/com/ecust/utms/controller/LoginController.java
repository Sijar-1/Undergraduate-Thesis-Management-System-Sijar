package com.ecust.utms.controller;

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
        //classpath:/templates/login2.html
        return "login2";
    }

    //@RequestMapping(value = "/user/login",method= RequestMethod.POST)
   @PostMapping(value = "/user/login")
    public String login(@RequestParam("userID") String userID, @RequestParam("inputPassword") String pwd,
                        @RequestParam("user") String usertype, Map<String,Object> map, HttpSession session){
        if("Student".equals(usertype)&&!StringUtils.isEmpty(userID)&&"123456".equals(pwd)){
            return "Student/message";
        }
        else{
          map.put("msg","用户名密码错误");
        return "login";
       }
    }

    @RequestMapping("/person")
    public  String Sperson(){
        return "Student/person2";
    }


    @RequestMapping("/message")
    public  String Smessage(){
        return "Student/message";
    }

   /* @RequestMapping("/login2")
    public String login2(){
        //classpath:/templates/login2.html
        return "login2";
    }*/

}
