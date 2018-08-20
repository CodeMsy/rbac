package com.rbac.controller;


import com.rbac.model.User;
import com.rbac.model.UserLogin;
import com.rbac.service.IUserLoginService;
import com.rbac.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class UserController extends  BaseController {

    @Autowired
    private IUserService userServiceImpl;

    @GetMapping("add")
    public String addUser(){
        return "/user/add";
    }

    @ResponseBody
    @PostMapping("add")
    public boolean saveUser(User user){
        return userServiceImpl.save(user);
    }


}

