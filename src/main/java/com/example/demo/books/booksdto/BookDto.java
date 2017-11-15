package com.example.demo.books.booksdto;

import com.example.demo.books.entity.Book;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class BookDto {

    @NotNull
    @JsonProperty
    private Integer bookId;

    @NotNull
    @JsonProperty
    private String title;

    @NotNull
    @JsonProperty
    private String author;

    @NotNull
    @JsonProperty
    private String publisher;

    @NotNull
    @JsonProperty
    private int yearPublished;

    @NotNull
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

    /**
     *
     * Converts a BookDto object into a Book object
     *
     * @param bookDto the bookDto object to be transformed by this function
     * @return Book A book object constructed from the input bookDto
     */
    public static Book convertBookDtoToBook(BookDto bookDto){
        return Book.builder()
                .bookId(bookDto.getBookId())
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .publisher(bookDto.getPublisher())
                .yearPublished(bookDto.getYearPublished())
                .isbn(bookDto.getIsbn())
                .build();
    }

}
