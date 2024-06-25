package com.Sheikh.JPAdemo;


import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String title;
    private int price;

    // Line for connect Autor table and Book table ,Author - parent , Book - Child;
    @ManyToOne
    @JoinColumn // it will take primary key of Author(authorId) as a foreign key to join tables
    Author author;

    public  Book()
    {
    }

    public Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
