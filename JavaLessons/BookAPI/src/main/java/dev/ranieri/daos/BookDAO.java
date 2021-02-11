package dev.ranieri.daos;

import dev.ranieri.entities.Book;

import java.util.Set;

// Every entity will have it's own DAO
// DAO Data Access Object is a class designed to perform CRUD operations for a single entity
// CRUD Create, Read, Update, Delete
public interface BookDAO {

    //CREATE
    Book createBook(Book book);

    //READ
    Set<Book> getAllBooks();
    Book getBookById(int id);

    //UPDATE
    Book updateBook(Book book);

    //DELETE
    boolean deleteBookById(int id);


}
