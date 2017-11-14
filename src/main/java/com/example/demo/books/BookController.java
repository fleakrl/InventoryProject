package com.example.demo.books;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> listBooks() {
        return Lists.newArrayList(
                bookRepository.findAll()
        );

    }

}