package com.alcideswenner.dsmovie.repositories;

import com.alcideswenner.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
