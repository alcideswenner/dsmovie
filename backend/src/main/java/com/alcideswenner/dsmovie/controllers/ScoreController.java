package com.alcideswenner.dsmovie.controllers;

import com.alcideswenner.dsmovie.dto.MovieDTO;
import com.alcideswenner.dsmovie.dto.ScoreDTO;
import com.alcideswenner.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO dto){
        return ResponseEntity.ok().body(scoreService.saveScore(dto));
    }
}
