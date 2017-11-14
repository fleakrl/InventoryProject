package com.example.demo.books;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@Table(name = "books")
@EqualsAndHashCode(callSuper = false, of = {"ISBN"})
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
