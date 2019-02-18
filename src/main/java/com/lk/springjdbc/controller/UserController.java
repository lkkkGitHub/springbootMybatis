package com.lk.springjdbc.controller;

import com.lk.springjdbc.finalUtils.UserFinalUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author leike
 * @date 2019/2/18 16:37
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session) {
        session.setAttribute(UserFinalUtil.USERNAME, username);
        return "redirect:/compartment/getAll";
    }

}
