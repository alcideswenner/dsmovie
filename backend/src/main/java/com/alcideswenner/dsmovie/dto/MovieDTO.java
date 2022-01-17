package com.alcideswenner.dsmovie.dto;

import com.alcideswenner.dsmovie.entities.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO(Movie movie){
        id=movie.getId();
        title=movie.getTitle();
        image=movie.getImage();
        count=movie.getCount();
        score=movie.getScore();
    }
}
