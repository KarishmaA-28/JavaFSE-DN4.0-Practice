package com.example.library.app;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        System.out.println("--- Starting Library Management Application ---");

        // Load the Spring ApplicationContext
        System.out.println("1. Loading Spring ApplicationContext from applicationContext.xml...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("   Spring ApplicationContext loaded successfully.");

        // Retrieve the BookService bean
        System.out.println("2. Retrieving BookService bean from the Spring container...");
        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("   BookService bean retrieved.");

        // Use the BookService to perform operations
        System.out.println("\n--- 3. Testing BookService Operations (which use injected BookRepository) ---");

        System.out.println("   a. Requesting all books:");
        List<String> books = bookService.retrieveAllBooks();
        if (books != null) {
            System.out.println("   Retrieved Books:");
            books.forEach(System.out::println);
        }

        System.out.println("\n   b. Requesting details for a specific book (ID: 'book123'):");
        String bookDetails = bookService.findBookDetails("book123");
        System.out.println("   " + bookDetails);

        // Close the application context
        System.out.println("\n4. Closing Spring ApplicationContext.");
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("--- Application Finished ---");
    }
}