package com.zxx.mgr.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: Andy
 * @time: 2021/4/17 15:35
 */
@Configuration
public class HomeController {
    @GetMapping(value = {"/","home"})
    public String home(){
        return "index.html";
    }
}
