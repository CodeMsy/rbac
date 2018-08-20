package com.rbac.controller;


import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author JiangJian
 * @since 2018-08-19
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("login")
    public String hello(ModelMap modelMap){
        modelMap.put("value","Hello JiangJian");
        return "login";
    }

}

