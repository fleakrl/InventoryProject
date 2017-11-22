package com.example.demo.movies.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "lc_portfolio_project", name = "movies")
public class Movie {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "director")
    private String director;

    @NotNull
    @Column(name = "studio")
    private String studio;

    @NotNull
    @Column(name = "movie_format")
    private String format;

    @NotNull
    @Column(name = "year_released")
    private Integer yearReleased;

    @NotNull
    @Column(name = "genre")
    private String genre;

}
