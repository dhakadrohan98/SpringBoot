package com.graphql.learn.controller;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    //why @autowired annotation here
    @Autowired
    private BookService bookService;
    //create
    //convert from JSON to java object with the help of @RequestBody annotation
    @PostMapping("/create/book")
    public Book create(@RequestBody Book book) {
        return this.bookService.create(book);
    }

    //get all
    @GetMapping("/books")
    public List<Book> getALl() {
        return this.bookService.getAll();
    }

    //get single book
    @GetMapping("books/{bookId}")
    public Book get(@PathVariable("bookId") int bookId) {
        return this.bookService.get(bookId);
    }
}
