package com.example.demo.books.controller;

import com.example.demo.books.booksdto.BookDto;
import com.example.demo.books.delegate.BooksDelegate;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private final BooksDelegate booksDelegate;

    @RequestMapping(method = RequestMethod.GET)
    public List<BookDto> listBooks() {
        return booksDelegate.getAllBooks();

    }

}