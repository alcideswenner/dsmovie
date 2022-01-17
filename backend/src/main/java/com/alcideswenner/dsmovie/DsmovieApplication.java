package com.alcideswenner.dsmovie;

import com.alcideswenner.dsmovie.entities.Movie;
import com.alcideswenner.dsmovie.entities.Score;
import com.alcideswenner.dsmovie.entities.User;
import com.alcideswenner.dsmovie.repositories.MovieRepository;
import com.alcideswenner.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsmovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsmovieApplication.class, args);
	}
	@Autowired
	private MovieRepository movieRepository;

	@Bean
	public InitializingBean init(){
	return ()->{
     
	};
}
}
