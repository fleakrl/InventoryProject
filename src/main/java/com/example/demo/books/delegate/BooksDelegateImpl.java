package com.example.demo.books.delegate;

import com.example.demo.books.booksdto.BookDto;
import com.example.demo.books.entity.Book;
import com.example.demo.books.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BooksDelegateImpl implements BooksDelegate {

    private final BooksService booksService;

    @Override
    public List<BookDto> getAllBooks() {

        return booksService.getAllBooks().stream()
                .map(BookDto::convertBooktoDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto addBook(BookDto bookToAdd) {
        Book book = BookDto.convertBookDtoToBook(bookToAdd);
        return BookDto.convertBooktoDto(booksService.addBook(book));
    }

    @Override
    public void deleteBook(Integer bookId) {
        booksService.deleteBook(bookId);
    }

    @Override
    public BookDto editBook(BookDto bookToEdit) {
        Book book = BookDto.convertBookDtoToBook(bookToEdit);
        return BookDto.convertBooktoDto(booksService.editBook(book));
    }
}
