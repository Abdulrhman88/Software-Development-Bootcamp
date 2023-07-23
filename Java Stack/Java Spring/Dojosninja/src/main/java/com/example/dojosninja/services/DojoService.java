package com.example.dojosninja.services;

import com.example.dojosninja.models.Dojo;
import com.example.dojosninja.repositories.DojoRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DojoService {
    private final DojoRepositories dojoRepository;

    public DojoService(DojoRepositories dojoRepository){
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> allDojo(){
        return dojoRepository.findAll();
    }

    // Create Dojo
    public void createDojo(Dojo dojo){
        dojoRepository.save(dojo);
    }

    // Return all Dojos
    public Dojo findDojo(long id){
        Optional<Dojo> dojo = dojoRepository.findById(id);
        if (dojo.isPresent()){
            return dojo.get();
        }else {
            return null;
        }
    }
}
