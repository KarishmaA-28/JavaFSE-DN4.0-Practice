package com.example.library.service;

import com.example.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService: Constructor called - I am the business logic.");
    }

    // Setter method for BookRepository - THIS IS CRUCIAL FOR DI
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("BookService: === Setter called! BookRepository dependency injected! ===");
        this.bookRepository = bookRepository;
    }

    public List<String> retrieveAllBooks() {
        if (bookRepository == null) {
            System.out.println("BookService: Error! BookRepository was NOT injected.");
            return null;
        }
        System.out.println("BookService: Using injected BookRepository to retrieve books.");
        return bookRepository.getAllBooks();
    }

    public String findBookDetails(String bookId) {
         if (bookRepository == null) {
            System.out.println("BookService: Error! BookRepository was NOT injected.");
            return null;
        }
        System.out.println("BookService: Using injected BookRepository to find book details.");
        return bookRepository.getBookById(bookId);
    }
}