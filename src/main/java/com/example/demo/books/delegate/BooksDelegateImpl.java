package com.example.demo.books.delegate;

import com.example.demo.books.entity.Book;
import com.example.demo.books.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BooksDelegateImpl implements BooksDelegate {

    private final BooksService booksService;

    @Override
    public List<Book> getAllBooks() {

        return booksService.getAllBooks();
    }
}
