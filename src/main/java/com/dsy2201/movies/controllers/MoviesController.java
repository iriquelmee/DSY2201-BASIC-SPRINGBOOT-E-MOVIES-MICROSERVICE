package com.dsy2201.movies.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.dsy2201.movies.models.Movies;
import com.dsy2201.movies.services.MoviesService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//CREATED AND MANTAINED BY IGNACIO RIQUELME 1-04-2024
@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping
    public List<Movies>getAllMovies() {
        return moviesService.getAllMovies();
    }
    
    @GetMapping("/{id}")
    public Optional<Movies>getMovieById(@PathVariable int id) {
        return moviesService.getMovieById(id);
    }
}
