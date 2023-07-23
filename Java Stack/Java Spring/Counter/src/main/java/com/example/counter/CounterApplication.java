package com.example.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class CounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CounterApplication.class, args);
    }

    @RequestMapping("/")
    public String index(HttpSession session){

        if(session.getAttribute("count") == null)
        {

            session.setAttribute("count",0);
        }
        else
        {
    //            Integer ccount = (Integer) session.getAttribute("count");
//            currentCount++;
//            session.setAttribute("count", ccount);


                session.setAttribute("count",(int) session.getAttribute("count")+1);
        }

        return "index.jsp";
    }

    @RequestMapping("/count")
    public String counter(Model model,HttpSession session){
        model.addAttribute("count", (int) session.getAttribute("count"));
        return "count.jsp";
    }

}