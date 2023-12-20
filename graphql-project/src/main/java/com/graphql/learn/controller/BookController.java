package com.graphql.learn.controller;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    //why @autowired annotation here
    @Autowired
    private BookService bookService;
    //create
    //convert from JSON to java object with the help of @RequestBody annotation.

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        return this.bookService.create(b);
    }

    //get all books
    @QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

    //get single book
    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return this.bookService.get(bookId);
    }
}