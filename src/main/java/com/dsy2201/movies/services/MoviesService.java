package com.dsy2201.movies.services;
import com.dsy2201.movies.models.Movies;
import java.util.List;
import java.util.Optional;

//CREATED AND MANTAINED BY IGNACIO RIQUELME 1-04-2024
public interface MoviesService {

    List<Movies>getAllMovies();
    Optional<Movies>getMovieById(int id);
    
}
