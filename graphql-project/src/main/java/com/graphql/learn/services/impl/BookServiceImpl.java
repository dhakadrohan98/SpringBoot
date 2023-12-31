package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Book;
import com.graphql.learn.repositories.BookRepo;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    //why @Autowired tag is above constructor
    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
    //return this.bookRepo.findById(bookId).get();
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book you're looking for not found on server!!"));
    }

    @Override
    public Book getByAuthor(String bookAuhtor) {
        try {
            return this.bookRepo.findByAuthor(bookAuhtor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
