package com.example.demo.books.service;

import com.example.demo.books.entity.Book;

import java.util.List;

public interface BooksService {

    /**
     *
     * @return List of all Books in the database
     */
    List<Book> getAllBooks();

    Book addBook(Book bookToAdd);
}
