package com.example.la.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Langues")
public class Langues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="name is required!")
    @Size(min=3,max = 20, message = "name must be between 3 and 20 characters ")
    private String name;

    @NotEmpty(message="creator is required!")
    @Size(min=3,max = 20, message = "creator must be between 3 and 20 characters")
    private String creator;

    @NotEmpty(message="Version is required!")
    @Size(min=3,max = 20, message = "Version must be between 3 and 20 number ")
    private String version;

    public Langues() {

    }

    public Langues(Long id, String name, String creator, String version) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
