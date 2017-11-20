package com.example.demo.books.delegate;

import com.example.demo.books.booksdto.BookDto;

import java.util.List;

public interface BooksDelegate {
    /**
     * @return List of all books
     */
    List<BookDto> getAllBooks();

    BookDto addBook(BookDto bookToAdd);

    void deleteBook(Integer bookId);

    BookDto editBook(BookDto bookToEdit);


}
