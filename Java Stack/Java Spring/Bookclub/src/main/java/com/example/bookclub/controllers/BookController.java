package com.example.bookclub.controllers;

import com.example.bookclub.models.Book;
import com.example.bookclub.models.User;
import com.example.bookclub.services.BookServices;
import com.example.bookclub.services.UserServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class BookController {

    private UserServies userServ;
    private BookServices bookServices;
   private UserController controller;

    public BookController(UserServies userServ, BookServices bookServices, UserController controller) {
        this.userServ = userServ;
        this.bookServices = bookServices;
        this.controller = controller;
    }

    @RequestMapping(value = "/dashbord",method = RequestMethod.GET)
    private String bookdashbord(Model model ,HttpSession session){

        if(!controller.ulogin(session)){
            return "redirect:/login";
        }
        model.addAttribute("books", bookServices.allbook());
        model.addAttribute("user",userServ.findUserById((long)session.getAttribute("user_id")));

        return "home.jsp";
    }
    @RequestMapping(value = "/book/new",method = RequestMethod.GET)
    public String indexnewbook(Model model ,HttpSession session,@ModelAttribute("book")Book b){
        model.addAttribute("user",userServ.findUserById((long)session.getAttribute("user_id")));
        return "new_book.jsp";
    }
    @RequestMapping(value = "/book/create", method = RequestMethod.POST)
    public String createbook(@Valid @ModelAttribute("createbook")Book book,BindingResult result ,HttpSession session) {
        if (!controller.ulogin(session)) {

            return "redirect:/login";
        }
        else if (result.hasErrors()) {

            return "redirect:/book/new";
        } else {
            User user = userServ.findUserById((long) session.getAttribute("user_id"));
            book.setUser(user);
            bookServices.createBook(book);
            return "redirect:/dashbord";
        }
    }
    @RequestMapping(value = "/info/{id}" , method = RequestMethod.GET)
    public String showbook (Model model,@PathVariable("id")long id,HttpSession session) {
        if(!controller.ulogin(session)){
            return "redirect:/login";
        }
        model.addAttribute("books", bookServices.findbook(id));
        model.addAttribute("user",userServ.findUserById((long)session.getAttribute("user_id")));
        return "show.jsp";


    }


}
