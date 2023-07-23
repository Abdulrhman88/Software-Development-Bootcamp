package com.example.bookbroker.models;

import com.example.bookbroker.models.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="title is required!")
    @Size(min=3, max=30, message="title must be between 3 and 30 characters")
    private String title;

    @NotEmpty(message="author is required!")
    @Size(min=3, max=30, message="author must be between 3 and 30 characters")
    private String author;






    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="borrowed_by")
    private User borrow;


    public Book(String title, String author, User user, User borrow ) {
        this.title = title;
        this.author = author;
        this.user = user;
        this.borrow = borrow;

    }

    public User getBorrow() {
        return borrow;
    }

    public void setBorrow(User borrow) {
        this.borrow = borrow;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Book(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
