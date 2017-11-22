package com.example.demo.movies.delegate;

import com.example.demo.movies.entity.Movie;
import com.example.demo.movies.moviesdto.MoviesDto;
import com.example.demo.movies.service.MoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MoviesDelegateImpl implements MoviesDelegate {

    private final MoviesService moviesService;

    @Override
    public List<MoviesDto> findAllMovies() {

        return moviesService.getAllMovies().stream()
                .map(MoviesDto::convertMovietoDto)
                .collect(Collectors.toList());
    }

    @Override
    public MoviesDto addMovie(MoviesDto movieToAdd) {
        Movie movie = MoviesDto.convertDtoToMovie(movieToAdd);

        return MoviesDto.convertMovietoDto(moviesService.addMovie(movie));
    }

    @Override
    public MoviesDto updateMovie(MoviesDto movieToUpdate) {
        return MoviesDto.convertMovietoDto(moviesService.updateMovie(MoviesDto.convertDtoToMovie(movieToUpdate)));
    }
}
