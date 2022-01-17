package com.alcideswenner.dsmovie.controllers;

import javax.websocket.server.PathParam;

import com.alcideswenner.dsmovie.dto.MovieDTO;
import com.alcideswenner.dsmovie.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findAll(Pageable page){
        return ResponseEntity.ok().body(movieService.findAll(page));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<MovieDTO> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(movieService.findById(id));
    }

}
