package com.example.demo1.Login.controller;


import com.example.demo1.Login.entity.Users;
import com.example.demo1.Login.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class IUserController {

    //植入对象
    @Resource(name = "iUserService")
    private IUserService service;

    /*返回頁面*/
    @RequestMapping("/getlogin")
    public String getlogin(){
        return "login";
    }
    /*t退出登录*/
    @RequestMapping("/remover")
    public String remover(){
        return "login";
    }

    /*登录*/
    @RequestMapping("/login")
    public ModelAndView login(Users user, ModelAndView mv, HttpServletRequest request, Model model){
        Users login = service.login(user.getUserName(),user.getPassword());
        System.out.println(login);
        if (login!=null){
            request.getSession().setAttribute("login",login);
            System.out.println("成功！！");
            mv.setViewName("index");
        }else{
            System.out.println("失败！！");
            request.setAttribute("msg","用户名或密码错误");
            mv.setViewName("login");
        }
        return mv;
    }

}