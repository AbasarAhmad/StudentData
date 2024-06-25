package com.Sheikh.JPAdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;
    private int noOfBooks;

    public Author()
    {

    }
    public Author(int authorId, int noOfBooks, String name) {
        this.authorId = authorId;
        this.noOfBooks = noOfBooks;
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

