package com.alcideswenner.dsmovie.dto;

import com.alcideswenner.dsmovie.entities.ScorePK;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDTO {
    private Long movieId;
    private String email;
    private Double score;
}
