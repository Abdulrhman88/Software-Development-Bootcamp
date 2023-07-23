
package com.example.bookapi.controllers;

import com.example.bookapi.models.Book;
import com.example.bookapi.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller

public class Bookcontroller {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public  String index(Model model){
        ArrayList<Book> b= (ArrayList<Book>) bookService.allBooks();
        model.addAttribute("books",b);

        return "index.jsp";
    }

    @RequestMapping("/books/{id}")
    public String show (Model model,@PathVariable("id")Long id) {
        Book b = bookService.findBook(id);
        model.addAttribute("books", b);
        return "show.jsp";

    }
}
