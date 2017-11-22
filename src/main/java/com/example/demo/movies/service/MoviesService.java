package com.example.demo.movies.service;

import com.example.demo.movies.entity.Movie;

import java.util.List;

public interface MoviesService {

    List<Movie> getAllMovies();

    Movie addMovie(Movie movieToAdd);

    Movie updateMovie(Movie movieToUpdate);
}
