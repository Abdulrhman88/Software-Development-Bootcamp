package com.example.la.services;
import com.example.la.models.Langues;
import com.example.la.repositories.laRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguesService {
    private final laRepositories laRepositories;
    public LanguesService(laRepositories laRepositories){
        this.laRepositories=laRepositories;
    }
    public List<Langues> alllangues(){

        return laRepositories.findAll();
    }
    public Langues createlangues(Langues p){

        return laRepositories.save(p);
    }
    public Langues findla(Long id){
        Optional<Langues> optionalPoke= laRepositories.findById(id);
        if (optionalPoke.isPresent()){
            return optionalPoke.get();
        }else {
            return null;
        }

    }
    public Langues updatela(Langues langues,Long id){
        Langues l=laRepositories.findById(id).get();
        l.setName(langues.getName());
        l.setCreator(langues.getCreator());
        l.setVersion(langues.getVersion());

        return laRepositories.save(l);

    }
    public void delet(Long id){

        Optional<Langues> l=laRepositories.findById(id);
        laRepositories.delete(l.get());
    }

}
