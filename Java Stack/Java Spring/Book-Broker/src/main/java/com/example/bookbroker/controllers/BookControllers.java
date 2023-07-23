package com.example.bookbroker.controllers;

import com.example.bookbroker.models.Book;
import com.example.bookbroker.models.LoginUser;
import com.example.bookbroker.models.User;
import com.example.bookbroker.services.BookServices;
import com.example.bookbroker.services.UserServies;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
@Controller
public class BookControllers {

    private UserServies userServ;
    private BookServices bookServices;
    private UserControllers controller;

    public BookControllers(UserServies userServ, BookServices bookServices, UserControllers controller) {
        this.userServ = userServ;
        this.bookServices = bookServices;
        this.controller = controller;
    }

    @RequestMapping(value = "/dashbord", method = RequestMethod.GET)
    private String bookdashbord(Model model, HttpSession session) {

        if (!controller.ulogin(session)) {
            return "redirect:/login";
        }

        model.addAttribute("books", bookServices.allbook());
        model.addAttribute("user", userServ.findUserById((long) session.getAttribute("user_id")));


        return "dashboord.jsp";
    }

    @RequestMapping(value = "/book/new", method = RequestMethod.GET)
    public String indexnewbook(Model model, HttpSession session, @ModelAttribute("book") Book b) {
        if (!controller.ulogin(session)) {
            return "redirect:/login";
        }

        model.addAttribute("user", userServ.findUserById((long) session.getAttribute("user_id")));
        return "new_book.jsp";
    }

    @RequestMapping(value = "/book/create", method = RequestMethod.POST)
    public String createbook(@Valid @ModelAttribute("createbook") Book book, BindingResult result, HttpSession session) {
        if (!controller.ulogin(session)) {

            return "redirect:/login";
        } else if (result.hasErrors()) {

            return "redirect:/book/new";
        } else {
            User user = userServ.findUserById((long) session.getAttribute("user_id"));
            book.setUser(user);
            bookServices.createBook(book);
            return "redirect:/dashbord";
        }
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public String showbook(Model model, @PathVariable("id") long id, HttpSession session) {
        if (!controller.ulogin(session)) {
            return "redirect:/login";
        }
        model.addAttribute("books", bookServices.findbook(id));
        model.addAttribute("user", userServ.findUserById((long) session.getAttribute("user_id")));
        return "show.jsp";


    }

    @RequestMapping(value = "/borrow/{id}")
    public String borrow(@PathVariable("id") Long id, Model model, HttpSession session) {
        Book book = bookServices.findbook(id);
        User user = userServ.findUserById((long) session.getAttribute("user_id"));
        book.setBorrow(user);
        bookServices.saveBook(book);
        return "redirect:/dashbord";

    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        bookServices.deleteBook(id);

        return "redirect:/dashbord";

    }

    @RequestMapping(value = "/book/{id}/edit")
    public String edit(@PathVariable("id") long id, Model model, @ModelAttribute("update") Book book, BindingResult result) {
        Book a = bookServices.findbook(id);
        model.addAttribute("ledit", a);
        return "edit.jsp";
    }

    @RequestMapping(value = "/book/{id}/update", method = RequestMethod.POST)
    public String update(@PathVariable("id") long id, @Valid @ModelAttribute("update") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/book/{id}/edit";
        } else {
            bookServices.updatela(book, id);
            return "redirect:/dashbord";
        }
    }

    @RequestMapping("/return/{id}")
    public String returnBook(@PathVariable("id") Long id, Model model) {
        bookServices.returnBook(bookServices.findbook(id));
        return "redirect:/dashbord";
    }
}