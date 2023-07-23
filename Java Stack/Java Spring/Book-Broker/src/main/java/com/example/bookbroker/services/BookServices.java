package com.example.bookbroker.services;

import com.example.bookbroker.models.Book;
import com.example.bookbroker.models.User;
import com.example.bookbroker.repositories.BookRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

    private  BookRepositories bookRepository;


    public BookServices(BookRepositories bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allbook(){
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book saveBook(Book book) {
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
    public void borrowBook(User user, long book_id){
        Optional<Book> book = bookRepository.findById(book_id);
        if(book.isPresent()){
            if(book.get().getBorrow() == null) {
                book.get().setBorrow(user);
                bookRepository.save(book.get());
            }
        }
    }
    public Book returnBook(Book book) {
        book.setBorrow(null);
        return bookRepository.save(book);
    }

    public void deleteBook(Long id ) {
        Optional<Book> b=bookRepository.findById(id);
        bookRepository.delete(b.get());

    }

    public Book updatela(Book book,Long id){
        Book b=bookRepository.findById(id).get();
        b.setTitle(b.getTitle());
        b.setAuthor(b.getAuthor());


        return bookRepository.save(b);

    }
}



