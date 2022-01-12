package com.astuno.moviecatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astuno.moviecatalog.entities.Score;
import com.astuno.moviecatalog.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
