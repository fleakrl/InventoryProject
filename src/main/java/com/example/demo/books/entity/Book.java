package com.example.demo.books.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false, of = {"ISBN"})
@Table(schema ="lc_portfolio_project", name = "books")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "author")
    private String author;

    @NotNull
    @Column(name = "publisher")
    private String publisher;

    @NotNull
    @Column(name = "year_published")
    private int yearPublished;

    @NotNull
    @Column(name = "isbn", unique = true)
    private String ISBN;

}
