package com.example.dojosninja.repositories;

import com.example.dojosninja.models.Dojo;
import com.example.dojosninja.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NinjaRepositories extends CrudRepository<Ninja, Long> {

    public List<Ninja> findAll();


}