package com.example.dojosninja.controllers;

import com.example.dojosninja.models.Dojo;
import com.example.dojosninja.services.DojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@EnableAutoConfiguration

@Controller
public class DojoControllers {
    @Autowired
    DojoService dojoService;
    @RequestMapping("/dojo/new")
    public String create(@ModelAttribute ("dojo") Dojo dojo)
    {

        return "index.jsp";
    }

    //show index show with id of dojo

    @RequestMapping(value = "/dojo/{id}", method = RequestMethod.GET)
    public String showDojo(@PathVariable(value = "id") long id, Model model, @ModelAttribute("dojo") Dojo dojo) {
        Dojo d = dojoService.findDojo(id);
        model.addAttribute("dojos", d);
        return "show.jsp";
    }

    @RequestMapping(value = "/dojo/new", method = RequestMethod.POST)
    public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result){
        if (result.hasErrors()){
            return "index.jsp";
        }else {
            dojoService.createDojo(dojo);
            return "redirect:/dojo/new";
        }
    }

    @RequestMapping("/dojos/{id}")
    public String showDojo(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("dojos",dojoService.findDojo(id));
        return "info.jsp";
    }


}

