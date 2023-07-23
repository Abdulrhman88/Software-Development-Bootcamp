package com.example.dojosninja.controllers;

import com.example.dojosninja.models.Dojo;
import com.example.dojosninja.models.Ninja;
import com.example.dojosninja.services.DojoService;
import com.example.dojosninja.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainControllers {
     @Autowired
    DojoService dojoService;
    NinjaService ninjaService;

    public MainControllers(DojoService dojoService ,NinjaService ninjaService){
        this.dojoService=dojoService;
        this.ninjaService=ninjaService;
    }
    @RequestMapping("/home")
    public String index(Model model){

        return "index.jsp";
    }
//    @GetMapping("ninjas/new")
//    public String showall(Model model){
//        List<Dojo> dojos=dojoService.allDojo();
//        model.addAttribute("dojos",dojos);
//        List<Ninja> ninjas=ninjaService.allninja();
//        model.addAttribute("ninjas",ninjas);
//        return "info.jsp";
//    }

}
