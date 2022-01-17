package com.alcideswenner.dsmovie.repositories;

import com.alcideswenner.dsmovie.entities.Score;
import com.alcideswenner.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,ScorePK>{
    
}
