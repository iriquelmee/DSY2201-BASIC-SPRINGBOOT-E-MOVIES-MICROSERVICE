package com.dsy2201.movies.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.dsy2201.movies.models.Movies;
import com.dsy2201.movies.services.MoviesService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping
    public Movies postMovies(@RequestBody Movies movie)
    {
        return moviesService.postMovie(movie);
    }

    @PutMapping("/{id}")
    public Movies putMovies(@PathVariable int id, @RequestBody Movies movie)
    {
        return moviesService.putMovie(id,movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id)
    {   
        moviesService.deleteMovie(id);
    }



}
