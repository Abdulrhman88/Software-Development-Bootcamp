package com.example.la.controllers;

import com.example.la.models.Langues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.la.services.LanguesService;

import javax.validation.Valid;
import java.util.ArrayList;
@EnableAutoConfiguration

@Controller
public class LanguesController {
    @Autowired
    LanguesService service;

    @RequestMapping(value = "/la", method = RequestMethod.GET)
    public String index(Model model) {
        ArrayList<Langues> l = (ArrayList<Langues>) service.alllangues();
        model.addAttribute("Langues", l);

        return "index.jsp";
    }

    @RequestMapping(value = "la/create", method = RequestMethod.POST)
    public String createp(@Valid @ModelAttribute("lang") Langues lang, BindingResult result) {

        if (result.hasErrors()) {
            return "redirect:/la";
        } else {
            service.createlangues(lang);
            return "redirect:/la";
        }
    }
    @RequestMapping("/la/{id}/show")


    public String show (Model model,@PathVariable("id")long id) {
        Langues p = service.findla(id);
        model.addAttribute("lashow", p);
        return "show.jsp";

    }
    @RequestMapping(value = "/la/{id}/edit")
    public String edit(@PathVariable ("id")long id ,  Model model,@ModelAttribute("update") Langues langues, BindingResult result){
        Langues a=service.findla(id);
        model.addAttribute("ledit",a);
        return "edit.jsp";
    }
    @RequestMapping(value = "/la/{id}/update", method = RequestMethod.POST)
    public String update(@PathVariable("id")long id,@Valid @ModelAttribute("update") Langues langues, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/la";
        } else {
            service.updatela(langues, id);
            return "redirect:/la";
        }


    }
    @RequestMapping(value="/la/destroy/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable(value = "id") long id) {
        service.delet(id);
        return "redirect:/la";
    }
    }