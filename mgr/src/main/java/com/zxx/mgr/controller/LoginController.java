package com.zxx.mgr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: Andy
 * @time: 2021/4/17 15:52
 */
@Controller
public class LoginController {
//    /**
//     * 入口
//     * @return
//     */
//    @RequestMapping(value={"/","/toLogin"},method= RequestMethod.GET)
//    public String toLogin(){
//        return "login123";
//    }
@GetMapping("/loginPage")
        public  String login(){
            return "login_page";
        }
    @GetMapping("/logoutPage")
    public  String logout(){
        return "login_page";
    }





}
