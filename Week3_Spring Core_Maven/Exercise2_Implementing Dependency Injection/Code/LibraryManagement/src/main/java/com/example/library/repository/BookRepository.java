package com.example.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository: Constructor called.");
    }

    public List<String> getAllBooks() {
        List<String> books = new ArrayList<>();
        books.add("The Lord of the Rings");
        books.add("Pride and Prejudice");
        books.add("1984");
        System.out.println("BookRepository: Fetching all books.");
        return books;
    }

    public String getBookById(String id) {
        System.out.println("BookRepository: Fetching book with ID: " + id);
        return "Book Details for ID " + id + ": 'Mystery Novel'";
    }
}
