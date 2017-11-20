package com.example.demo.books.service;

import com.example.demo.books.entity.Book;
import com.example.demo.books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BooksServiceImpl implements BooksService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book bookToAdd) {
        return bookRepository.save(bookToAdd);
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookRepository.delete(bookId);
    }

    @Override
    public Book editBook(Book bookToEdit) {

        //Check to see if book id is in repository
        Book one = bookRepository.findOne(bookToEdit.getBookId());

        //if not throw exception
        if (one == null) {
            throw new RuntimeException("Book not found with ID: " + bookToEdit.getBookId());
        }

        //if book id is in database save book updates
        return bookRepository.save(bookToEdit);

    }
}
