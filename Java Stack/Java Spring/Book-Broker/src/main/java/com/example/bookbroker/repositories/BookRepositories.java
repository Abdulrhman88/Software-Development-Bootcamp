package com.example.bookbroker.repositories;

import com.example.bookbroker.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepositories extends CrudRepository<Book, Long> {

    List<Book> findAll();

}
