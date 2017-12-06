package com.example.demo.movies.controller;

import com.example.demo.movies.delegate.MoviesDelegate;
import com.example.demo.movies.moviesdto.MoviesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/movies")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MoviesController {

    private final MoviesDelegate moviesDelegate;

    /**
     * On GET requests to /movies return a list of all movies in the movies table
     *
     * @return LIST<MoviesDto> of the movies in the movies table
     */
    @RequestMapping(method = RequestMethod.GET, path = "/movies")
    public List<MoviesDto> getAllMovies() {
        return moviesDelegate.findAllMovies();
    }


    /**
     * On POST requests to /movies add a movie to the movies table
     *
     * @param movieToAdd JSON Request body data that gets mapped to a MoviesDto object
     * @return MovieDto object of the movie data added to the movies table
     */
    @RequestMapping(method = RequestMethod.POST, path = "/movies")
    public MoviesDto addMovie(@RequestBody MoviesDto movieToAdd) {
        return moviesDelegate.addMovie(movieToAdd);
    }


    @RequestMapping(method = RequestMethod.PUT, path = "/movies")
    public MoviesDto updateMovie(@RequestBody MoviesDto movieToUpdate){
       return moviesDelegate.updateMovie(movieToUpdate);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/movies/{movieId}")
    public void deleteMovie(@PathVariable Integer movieId){
        moviesDelegate.deleteMovie(movieId);
    }

}

