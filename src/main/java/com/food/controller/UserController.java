package com.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    }
}
