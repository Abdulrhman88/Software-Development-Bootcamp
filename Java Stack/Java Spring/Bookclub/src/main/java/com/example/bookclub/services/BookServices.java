package com.example.bookclub.services;

import com.example.bookclub.models.Book;
import com.example.bookclub.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {


    private final BookRepository bookRepository;


    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allbook(){
        return bookRepository.findAll();
    }
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findbook(Long id){
        Optional<Book> optionalPoke= bookRepository.findById(id);
        if (optionalPoke.isPresent()){
            return optionalPoke.get();
        }else {
            return null;
        }

    }
}
