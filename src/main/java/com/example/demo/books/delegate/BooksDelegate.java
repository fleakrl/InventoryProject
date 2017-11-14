package com.example.demo.books.delegate;

import com.example.demo.books.entity.Book;

import java.util.List;

public interface BooksDelegate {
    /**
     *
     * @return List of all books
     */
    List<Book> getAllBooks();
}
