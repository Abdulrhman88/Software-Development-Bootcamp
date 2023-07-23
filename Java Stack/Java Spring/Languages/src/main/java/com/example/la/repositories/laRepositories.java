package com.example.la.repositories;

import com.example.la.models.Langues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface laRepositories extends CrudRepository<Langues, Long> {

    public List<Langues> findAll();


}
