package com.example.demo.movies.controller;

import com.example.demo.movies.delegate.MoviesDelegate;
import com.example.demo.movies.moviesdto.MoviesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/movies")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MoviesController {

    private final MoviesDelegate moviesDelegate;

    @RequestMapping(method = RequestMethod.GET, path = "/movies")
    public List<MoviesDto> getAllMovies(){
        return moviesDelegate.findAllMovies();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/movies")
    public MoviesDto addMovie(@RequestBody MoviesDto movieToAdd){
        return moviesDelegate.addMovie(movieToAdd);

    }

}

