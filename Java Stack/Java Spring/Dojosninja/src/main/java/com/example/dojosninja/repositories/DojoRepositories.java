package com.example.dojosninja.repositories;

import com.example.dojosninja.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepositories extends CrudRepository<Dojo, Long> {

    public List<Dojo> findAll();


}
