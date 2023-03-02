package com.example.marvel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marvel.Dao.CharactersRepository;
import com.example.marvel.Domains.Characters;


//Clase que hace de intermediario entre el controlador y el repositorio
@Service
public class CharactersService {
    
    @Autowired
    private CharactersRepository charactersRepository;
    
    public void save(Characters character){
        charactersRepository.save(character);
    }

    public List<Characters> findAll(){
        return charactersRepository.findAll();
    }

    public Optional<Characters> findById(String id){
        return charactersRepository.findById(id);
    }

    public void deleteById(String id){
        charactersRepository.deleteById(id);
    }

    public void removeAll(){
        charactersRepository.deleteAll();
    }
}
