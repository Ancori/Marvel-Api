package com.example.marvel.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.marvel.Domains.Characters;

@Repository
public interface CharactersRepository extends MongoRepository<Characters,String>{
    
}
