package com.dsy2201.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dsy2201.movies.models.Movies;

//CREATED AND MANTAINED BY IGNACIO RIQUELME 1-04-2024
public interface MoviesRepository extends JpaRepository<Movies,Integer> {

    
}