//package com.example.demo1.Sys.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpSession;
//import java.util.Map;
//
//@Controller
//public class LoginController {
//
////    @DeleteMapping
////    @PutMapping
////    @GetMapping
//
//    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
//    @PostMapping(value = "/user/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Map<String,Object> map, HttpSession session){
//        if("admin".equals(username) && "123456".equals(password)){
//            //登陆成功，防止表单重复提交，可以重定向到主页
//            session.setAttribute("loginUser",username);
//            return "redirect:/main.html";
//        }else{
//            //登陆失败
//            map.put("msg","用户或名密码错误");
//            return  "login";
//        }
//
//    }
//}