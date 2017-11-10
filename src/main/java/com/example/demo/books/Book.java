package com.example.demo.books;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false, of={"ISBN"})
public class Book {

    private Long bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private String ISBN;

}
