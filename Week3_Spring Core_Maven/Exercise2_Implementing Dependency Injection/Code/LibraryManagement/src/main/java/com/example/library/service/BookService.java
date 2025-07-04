package com.example.library.service;

import com.example.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService: Constructor called.");
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("BookService: Setting BookRepository dependency.");
        this.bookRepository = bookRepository;
    }

    public List<String> getAllAvailableBooks() {
        if (bookRepository == null) {
            System.out.println("BookService: BookRepository is NOT set!");
            return null;
        }
        System.out.println("BookService: Getting all books via BookRepository.");
        return bookRepository.getAllBooks();
    }

    public String getDetailsForBook(String bookId) {
        if (bookRepository == null) {
            System.out.println("BookService: BookRepository is NOT set!");
            return null;
        }
        System.out.println("BookService: Getting book details via BookRepository.");
        return bookRepository.getBookById(bookId);
    }
}
