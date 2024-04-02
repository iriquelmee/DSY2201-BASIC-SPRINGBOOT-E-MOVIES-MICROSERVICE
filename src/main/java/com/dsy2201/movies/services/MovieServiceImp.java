package com.dsy2201.movies.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsy2201.movies.models.Movies;
import com.dsy2201.movies.repository.MoviesRepository;

//CREATED AND MANTAINED BY IGNACIO RIQUELME 1-04-2024
@Service
public class MovieServiceImp implements MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public Optional<Movies> getMovieById(int id) {
        return moviesRepository.findById(id);
    }
    
}
