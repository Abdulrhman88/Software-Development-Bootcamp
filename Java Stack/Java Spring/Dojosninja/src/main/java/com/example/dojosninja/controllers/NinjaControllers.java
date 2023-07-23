package com.example.dojosninja.controllers;

import com.example.dojosninja.models.Dojo;
import com.example.dojosninja.models.Ninja;
import com.example.dojosninja.services.DojoService;
import com.example.dojosninja.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaControllers {

    @Autowired
    NinjaService ninjaService;
    DojoService dojoService;

    public NinjaControllers(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }


    @RequestMapping(value = "/ninjas/new", method = RequestMethod.GET)
    public String create(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> dojos = dojoService.allDojo();
        model.addAttribute("dojos", dojos);
        return "show.jsp";
    }

    @RequestMapping(value = "/ninjas/new", method = RequestMethod.POST)
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model model, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/ninjas/new";
        } else {

            ninjaService.createNinja(ninja);

            return "info.jsp";
        }
    }


}