package com.example.dojosninja.services;

import com.example.dojosninja.models.Ninja;
import com.example.dojosninja.repositories.NinjaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepositories ninjerepo;

    public NinjaService(NinjaRepositories ninjerepo)
    {

        this.ninjerepo = ninjerepo;
    }


    public List<Ninja> allninja(){

        return ninjerepo.findAll();
    }
    public Ninja createNinja(Ninja ninja){

        return ninjerepo.save(ninja);
    }
    public Ninja findNinja(long id){

        Optional<Ninja>ONinja=ninjerepo.findById(id);
        if (ONinja.isPresent()){
            return  ONinja.get();
        }else {
            return null;
        }
    }

}
