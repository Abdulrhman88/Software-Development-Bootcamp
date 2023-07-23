package com.example.ninjagold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@SpringBootApplication
@Controller
public class NinjagoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjagoldApplication.class, args);
    }

    @RequestMapping("/gold")
    public String index(Model model ,HttpSession session) {
        if(session.getAttribute("gold") == null)
        {

            session.setAttribute("gold",0);
        }
        if (session.getAttribute("log") == null)
        {
            //session.setAttribute("acc",(int)session.getAttribute("gold"));
            ArrayList<String> log = new ArrayList<String>();
            session.setAttribute("log",log);

        }

        model.addAttribute("gold",(int)session.getAttribute("gold"));
        model.addAttribute("log",(ArrayList<String>) session.getAttribute("log"));


        return "index.jsp";
    }
    @RequestMapping(value = "/gold" ,method = RequestMethod.POST)
    public  String in(Model model, HttpSession session , @RequestParam (value= "loc")String loc) {

        if (loc.equals("farm")){

            int ernedgold=Randomnumber(10,20);

            session.setAttribute("gold",(int)session.getAttribute("gold")+ernedgold);
            ArrayList <String> log=(ArrayList<String>) session.getAttribute("log");


            String m1=String.format("You have earned %d from farm",(int) session.getAttribute("gold")+ernedgold);
            log.add(m1);
            session.setAttribute("log",log);

        } else if (loc.equals("cave")) {

            int ernedgold=Randomnumber(5,10);
            session.setAttribute("gold",(int)session.getAttribute("gold")+ernedgold);
            ArrayList <String> log=(ArrayList<String>) session.getAttribute("log");
            String m2=String.format("You have earned %d from cave",(int)session.getAttribute("gold")+ernedgold);
            log.add(m2);
            session.setAttribute("log",log);


        } else if (loc.equals("house")) {
            int ernedgold=Randomnumber(2,5);
            session.setAttribute("gold",(int)session.getAttribute("gold")+ernedgold);

            ArrayList <String> log=(ArrayList<String>) session.getAttribute("log");
            String m3=String.format("You have earned %d from house",(int)session.getAttribute("gold")+ernedgold);
            log.add(m3);
            session.setAttribute("log",log);

        }else if (loc.equals("casino")) {
            int ernedgold=Randomnumber(0,50);

            session.setAttribute("gold",(int)session.getAttribute("gold")+ernedgold);

            ArrayList<String> log=(ArrayList<String>) session.getAttribute("log");
            String m4=String.format("You have earned %d from casino",(int)session.getAttribute("gold")+ernedgold);
            log.add(m4);
            session.setAttribute("log",log);

    }

     return "redirect:/gold";

    }
    public int Randomnumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}

    





