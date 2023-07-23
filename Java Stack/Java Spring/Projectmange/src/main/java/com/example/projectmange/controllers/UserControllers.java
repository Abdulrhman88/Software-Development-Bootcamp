package com.example.projectmange.controllers;

import com.example.projectmange.models.Login;
import com.example.projectmange.models.User;
import com.example.projectmange.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class UserControllers {
    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new Login());
        return "index.jsp";
    }
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, Model model, HttpSession session) {
        userServices.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new Login());
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        return "redirect:/home";
    }
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") Login newLogin, BindingResult result, Model model, HttpSession session) {

        User user = userServices.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session) {
        Long user_id = (Long) session.getAttribute("user_id");
        if (user_id != null) {
            User user = userServices.findUserById(user_id);
            model.addAttribute("user", user);
            return "redirect:/dashbord";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user_id");
        return "redirect:/";
    }

    public boolean ulogin(HttpSession session) {
        if (session.getAttribute("user_id") != null) {
            return true;
        } else {
            return false;
        }
    }
}
