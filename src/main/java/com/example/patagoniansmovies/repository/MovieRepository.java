package com.example.patagoniansmovies.repository;

import com.example.patagoniansmovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
