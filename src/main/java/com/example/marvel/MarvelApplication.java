package com.example.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.marvel.Dao.CharactersRepository;


@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CharactersRepository.class)
public class MarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarvelApplication.class, args);
	}

}
