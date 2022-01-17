package com.alcideswenner.dsmovie.services;

import com.alcideswenner.dsmovie.dto.MovieDTO;
import com.alcideswenner.dsmovie.entities.Movie;
import com.alcideswenner.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO>findAll(Pageable page){
        Page<Movie>lista=movieRepository.findAll(page);
        Page<MovieDTO>listaDTO=lista.map(e->new MovieDTO(e));
        return listaDTO;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie movie=movieRepository.findById(id).get();
        MovieDTO movieDTO=new MovieDTO(movie);
        return movieDTO;
    }
}
