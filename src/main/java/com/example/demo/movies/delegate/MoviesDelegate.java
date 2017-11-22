package com.example.demo.movies.delegate;


import com.example.demo.movies.moviesdto.MoviesDto;

import java.util.List;

public interface MoviesDelegate {

    List<MoviesDto> findAllMovies();

}
