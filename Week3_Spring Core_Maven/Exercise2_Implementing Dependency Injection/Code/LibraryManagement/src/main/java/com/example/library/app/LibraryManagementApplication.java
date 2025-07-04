package com.example.library.app;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        System.out.println("--- Library Management Application Starting ---");

        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean (with BookRepository injected)
        BookService bookService = context.getBean("bookService", BookService.class);

        // Get and print all books
        System.out.println("\n--- All Available Books ---");
        List<String> books = bookService.getAllAvailableBooks();
        if (books != null) books.forEach(System.out::println);

        // Get and print book details
        System.out.println("\n--- Book Details for ID XYZ123 ---");
        String bookDetail = bookService.getDetailsForBook("XYZ123");
        System.out.println(bookDetail);

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("\n--- Application Finished ---");
    }
}
