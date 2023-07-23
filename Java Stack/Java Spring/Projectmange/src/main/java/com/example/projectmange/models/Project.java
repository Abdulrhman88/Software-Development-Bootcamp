package com.example.projectmange.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="title is required!")
    @Size(min=3, max=30, message="title must be between 3 and 30 characters")
    private String title;

    @NotEmpty(message="title is required!")
    @Size(min=3, max=30, message="title must be between 3 and 30 characters")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="join_b")
    private User join;

    public Project() {

    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getJoin() {
        return join;
    }

    public void setJoin(User join) {
        this.join = join;
    }

    public Project(String title, String description, User user, User join) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.join = join;
    }
}
