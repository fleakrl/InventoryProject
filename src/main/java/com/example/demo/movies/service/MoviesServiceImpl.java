package com.example.demo.movies.service;

import com.example.demo.movies.entity.Movie;
import com.example.demo.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MoviesServiceImpl implements MoviesService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie addMovie(Movie movieToAdd) {
        return movieRepository.save(movieToAdd);
    }

    @Override
    public Movie updateMovie(Movie movieToUpdate) {
        //See if movie id is in movie table
        Movie one = movieRepository.findOne(movieToUpdate.getMovieId());

        //if id is not in table throw exception
        if(one == null){
            throw new RuntimeException("Movie not found with id: " + movieToUpdate.getMovieId());
        }
        //else save movieToUpdate
        return movieRepository.save(movieToUpdate);
    }


    @Override
    public void deleteMovie(Integer movieID) {
        movieRepository.delete(movieID);

    }
}
