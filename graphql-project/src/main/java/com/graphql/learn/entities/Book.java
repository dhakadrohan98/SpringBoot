package com.graphql.learn.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="project_books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

    public Book() {
        super();
    }

    public Book(int id, String title, String desc, String author, double price, int pages) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }
}
