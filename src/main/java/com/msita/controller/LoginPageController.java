package com.msita.controller;

import com.msita.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginPageController {
    @GetMapping("/login")
    public String login(final Model model){
        model.addAttribute("loginForm" , new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("loginForm") final  LoginForm loginForm, final Model model , HttpSession httpSession){
        final String username = loginForm.getUsername();
        final String password = loginForm.getPassword();
        if ("admin".equals(username) && "12345".equals(password)){
            httpSession.setAttribute("username" , username);
            return "homepage";
        }
        model.addAttribute("errorMessage" , "Id or password is invalid");
        return "login";
    }
}
