package com.example.fruityloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@SpringBootApplication
@Controller
public class FruityLoopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruityLoopApplication.class, args);
    }

    // ...
    @RequestMapping("/")
    public String in1(Model model) {
        ArrayList<Item> f = new ArrayList<Item>();

        f.add(new Item("Kiwi", 1.5));
        f.add(new Item("Mango", 2.0));
        f.add(new Item("Goji Berries", 4.0));
        f.add(new Item("Guava", .75));



        // Add fruits your view model here
        model.addAttribute("fruits" , f);


        return "index.jsp";
    }
}
// ...




