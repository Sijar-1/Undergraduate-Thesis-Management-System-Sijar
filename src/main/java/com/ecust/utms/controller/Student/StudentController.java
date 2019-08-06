package com.ecust.utms.controller.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class StudentController {
    @GetMapping("/message")
    public String showMessagePage(Map<String,Object> map, HttpSession session, HttpServletRequest request){
        String loginuser=""+session.getAttribute("loginuser");
        return "Student/message";
    }
    @GetMapping("/topic")
    public String showTopicPage(Map<String,Object> map, HttpSession session, HttpServletRequest request){
        String loginuser=""+session.getAttribute("loginuser");
        return "Student/topic";
    }
    @GetMapping("/person")
    public String showPersonPage(Map<String,Object> map, HttpSession session, HttpServletRequest request){
        String loginuser=""+session.getAttribute("loginuser");
        return "Student/person";
    }
    @GetMapping("/question")
    public String showQuestionPage(Map<String,Object> map, HttpSession session, HttpServletRequest request){
        String loginuser=""+session.getAttribute("loginuser");
        return "Student/question";
    }
    @GetMapping("/dissertation")
    public String showDissertationPage(Map<String,Object> map, HttpSession session, HttpServletRequest request){
        String loginuser=""+session.getAttribute("loginuser");
        return "Student/dissertation";
    }

}
