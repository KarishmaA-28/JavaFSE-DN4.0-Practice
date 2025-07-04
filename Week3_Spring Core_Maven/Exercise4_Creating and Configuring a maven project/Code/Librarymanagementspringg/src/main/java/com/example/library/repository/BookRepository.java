package com.example.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository: Constructor called - I am ready to access data.");
    }

    public List<String> getAllBooks() {
        List<String> books = new ArrayList<>();
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Dune");
        books.add("Foundation");
        System.out.println("BookRepository: Retrieved a list of books from the 'database'.");
        return books;
    }

    public String getBookById(String id) {
        System.out.println("BookRepository: Looking up book by ID: " + id);
        return "Details for Book ID " + id + ": 'Classic Sci-Fi'";
    }
}