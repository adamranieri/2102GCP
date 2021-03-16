package dev.ranieri.services;

import dev.ranieri.entities.Book;

import java.util.Set;

public interface BookService {

    //CREATE
    Book registerBook(Book book);

    //READ
    Book getBookById(int id);
    Set<Book> getAllBooks();

    //UPDATE
    Book updateBook(Book book);

    //Delete
    boolean deleteBookById(int id);


}
