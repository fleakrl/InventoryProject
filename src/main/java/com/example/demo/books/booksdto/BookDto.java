package com.example.demo.books.booksdto;

import com.example.demo.books.entity.Book;
import lombok.Builder;

@Builder
public class BookDto {

    private Integer bookId;

    private String title;

    private String author;

    private String publisher;

    private int yearPublished;

    private String isbn;

    /**
     *
     * Converts a Book object into a BookDto object
     *
     * @param book the book object to be transformed by this function
     * @return BookDto A book data transfer object constructed from the input book
     */
    public static BookDto convertBooktoDto(Book book) {
        return builder()
                .bookId(book.getBookId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .publisher(book.getPublisher())
                .yearPublished(book.getYearPublished())
                .isbn(book.getIsbn())
                .build();


    }

}
