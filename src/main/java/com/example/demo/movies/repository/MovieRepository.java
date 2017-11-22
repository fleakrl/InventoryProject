package com.example.demo.movies.repository;

import com.example.demo.movies.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository <Movie, Integer> {

    /**
     *
     * @return a list of movies in the Movies table of the database
     */
    List<Movie> findAll();
}
