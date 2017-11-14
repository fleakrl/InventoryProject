package com.example.demo.books.booksdto;

import com.example.demo.books.entity.Book;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto {

    @JsonProperty
    private Integer bookId;

    @JsonProperty
    private String title;

    @JsonProperty
    private String author;

    @JsonProperty
    private String publisher;

    @JsonProperty
    private int yearPublished;

    @JsonProperty
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
