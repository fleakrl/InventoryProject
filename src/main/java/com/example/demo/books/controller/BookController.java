package com.example.demo.books.controller;

import com.example.demo.books.booksdto.BookDto;
import com.example.demo.books.delegate.BooksDelegate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Handles requests to /books
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private final BooksDelegate booksDelegate;


    /**
     * On the GET request for /books return a list of all books in the database
     *
     * @return Returns a list of all books in the database
     */
    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<BookDto> listBooks() {

        return booksDelegate.getAllBooks();
    }

    /**
     * On the POST request for /books create a Book object that gets saved to the database
     *
     * @param bookToAdd This is a BookDto object that is created from the JSON included in the request body.
     * @return BooDto of the book data added to the database
     */
    @RequestMapping(method = RequestMethod.POST, path ="/books")
    public BookDto addBook(@RequestBody BookDto bookToAdd) {

        return booksDelegate.addBook(bookToAdd);
    }


    /**
     * On the DELETE request at /books/{bookId} delete the book from the database with the given bookId
     * @param bookId the bookId of the book to be deleted from the database
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/books/{bookId}")
    public void deleteBook(@PathVariable Integer bookId) {

        booksDelegate.deleteBook(bookId);
    }

    /**
     *
     * @param bookToEdit BookDto object of the book
     * @return BookDto of the book after edits have been made
     */
    @RequestMapping(method = RequestMethod.PUT, path = "/books")
    public BookDto editBook(@RequestBody BookDto bookToEdit) {

        return booksDelegate.editBook(bookToEdit);
    }

}