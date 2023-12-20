package com.graphql.learn.services;

import com.graphql.learn.entities.Book;
import java.util.List;

public interface BookService {

    //create
    public Book create(Book book);

    public List<Book> getAll();

    public Book get(int bookId);
}
