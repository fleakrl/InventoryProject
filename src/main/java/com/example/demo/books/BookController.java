package com.example.demo.books;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/books")
public class BookController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> listBooks() {
        return Lists.newArrayList(
                Book.builder()
                        .title("Harry Potter")
                        .author("JK Rowling")
                        .publisher("Scholastic")
                        .yearPublished(2000)
                        .ISBN("12")
                        .build(),
                Book.builder()
                        .title("A Local Habitation")
                        .author("Seanan McGuire")
                        .publisher("Daw Books")
                        .yearPublished(12)
                        .ISBN("123")
                        .build()
        );

    }

}