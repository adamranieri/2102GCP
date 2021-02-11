package dev.ranieri.services;

import dev.ranieri.entities.Book;

import java.util.Set;

// Most of the business logic for an applicaiton is in its services
// Business logic is the implementation of application specific rules or features
// A service might alsohave mthods that wrap around a dao class and are faily lean in business logic
public interface BookService {

    Book registerBook(Book book);

    Set<Book> getAllBooks();
    Set<Book> getBooksByTitle(String title);
    Book getBookById(int id);

    //
    Book updateBook(Book book);

    boolean deleteBookById(int id);

}
