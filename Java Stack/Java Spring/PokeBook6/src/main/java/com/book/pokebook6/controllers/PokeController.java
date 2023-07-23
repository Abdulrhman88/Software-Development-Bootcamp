package com.book.pokebook6.controllers;

import com.book.pokebook6.models.Poke;
import com.book.pokebook6.repositories.PokeRepository;
import com.book.pokebook6.services.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import javax.naming.Binding;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class PokeController {
    @Autowired
    PokeService pokeService;



    @RequestMapping(value = "/poke" ,method = RequestMethod.GET)

    public String index(Model model){

        ArrayList<Poke> p=(ArrayList<Poke>) pokeService.allpoke();
        model.addAttribute("pokes",p);

        return "index.jsp";
    }


    @RequestMapping(value = "poke/create",method = RequestMethod.POST)
    public String createp(@Valid @ModelAttribute("poke")Poke poke, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/poke";
        }else {
            pokeService.createPoke(poke);
            return "redirect:/poke";
        }
    }
    @RequestMapping("/poke/{id}/show")
    public String show (Model model,@PathVariable("id")long id) {
        Poke p = pokeService.findPoke(id);
        model.addAttribute("pokeshow", p);
        return "show.jsp";

    }
    @RequestMapping(value = "/poke/{id}/edit")
    public String edit(@PathVariable ("id")long id , Model model,@ModelAttribute("pokeupdate") Poke poke, BindingResult result){
        Poke a=pokeService.findPoke(id);
        model.addAttribute("pokee",a);
        return "edit.jsp";
    }


    @RequestMapping(value = "/poke/{id}/update", method = RequestMethod.POST)
    public String update(@PathVariable("id")long id,@Valid @ModelAttribute("pokeupdate") Poke poke, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/edit.jsp";
        } else {
        pokeService.updatepoke(poke, id);
            return "redirect:/poke";
        }
    }
    @RequestMapping(value="/poke/destroy/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") long id) {

        pokeService.delet(id);
        return "redirect:/poke";
    }
}




