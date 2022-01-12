package com.astuno.moviecatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astuno.moviecatalog.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
