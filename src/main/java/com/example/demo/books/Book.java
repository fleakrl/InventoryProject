package com.example.demo.books;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

    private Long bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private String ISBN;

}
