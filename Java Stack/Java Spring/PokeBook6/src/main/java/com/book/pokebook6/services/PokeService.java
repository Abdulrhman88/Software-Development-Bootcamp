package com.book.pokebook6.services;

import com.book.pokebook6.models.Poke;
import org.springframework.stereotype.Service;
import com.book.pokebook6.repositories.PokeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PokeService {
    private final PokeRepository pokeRepository;

    public PokeService(PokeRepository pokeRepository){

        this.pokeRepository = pokeRepository;
    }



    public List<Poke> allpoke(){

        return pokeRepository.findAll();
   }
   public Poke createPoke(Poke p){

        return pokeRepository.save(p);
   }
   public Poke findPoke(Long id){
       Optional<Poke> optionalPoke= pokeRepository.findById(id);
       if (optionalPoke.isPresent()){
           return optionalPoke.get();
       }else {
           return null;
       }

   }
   public Poke updatepoke(Poke poke,Long id){
        Poke u=pokeRepository.findById(id).get();
        u.setExpense(poke.getExpense());
        u.setVendor(poke.getVendor());
        u.setAmount(poke.getAmount());
        u.setDescription(poke.getDescription());
        return pokeRepository.save(u);

   }
   public void delet(Long id){
     Optional<Poke>  p =  pokeRepository.findById(id);
        pokeRepository.delete(p.get());

   }


}
