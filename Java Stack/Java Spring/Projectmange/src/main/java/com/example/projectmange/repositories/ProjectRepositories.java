package com.example.projectmange.repositories;

import com.example.projectmange.models.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepositories extends CrudRepository<Project, Long> {
    List<Project>findAll();
}
