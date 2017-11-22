package com.example.demo.movies.moviesdto;

import com.example.demo.movies.entity.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class MoviesDto {


    @NotNull
    @JsonProperty
    private Integer movieId;

    @NotNull
    @JsonProperty
    private String title;

    @NotNull
    @JsonProperty
    private String director;

    @NotNull
    @JsonProperty
    private String studio;

    @NotNull
    @JsonProperty
    private String format;

    @NotNull
    @JsonProperty
    private Integer yearReleased;

    @NotNull
    @JsonProperty
    private String genre;

    /**
     * Converts a MoviesDto object into a Movie Object
     *
     * @param moviesDto the MoviesDto object to be transformed by this function
     * @return Movie a Movie object constructed from the input MovieDto
     */
    public static Movie convertDtoToMovie(MoviesDto moviesDto){
        return Movie.builder()
                .movieId(moviesDto.getMovieId())
                .title(moviesDto.getTitle())
                .director(moviesDto.getDirector())
                .studio(moviesDto.getStudio())
                .format(moviesDto.getFormat())
                .yearReleased(moviesDto.getYearReleased())
                .genre(moviesDto.getGenre())
                .build();
    }


    /**
     * Converts a Movie object into a MoviesDto object
     *
     * @param movie the Movie object to be transformed by this function
     * @return MoviesDto a MoviesDto object constructed from the input Movie object
     */
    public static MoviesDto convertMovietoDto(Movie movie){
        return MoviesDto.builder()
                .movieId(movie.getMovieId())
                .title(movie.getTitle())
                .director(movie.getDirector())
                .studio(movie.getStudio())
                .format(movie.getFormat())
                .yearReleased(movie.getYearReleased())
                .genre(movie.getGenre())
                .build();
    }
}
