package dev.ranieri.daos;

import dev.ranieri.entities.Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Local in memory "database". It will save objects in memeory but if you shut off the application it will get deleted
public class BookDaoLocal implements  BookDAO{

    private static Map<Integer,Book> bookTable = new HashMap<Integer,Book>();
    private static int idMaker = 0;

    @Override
    public Book createBook(Book book) {
        book.setBookId(++idMaker);// create a new and unique id for the book Most databases just increment a counter
        bookTable.put(book.getBookId(),book); // emulates saving to a SQL database table
        return book;
    }

    @Override
    public Set<Book> getAllBooks() {
        Set<Book> allBooks = new HashSet<Book>(bookTable.values());
        return allBooks;
    }

    @Override
    public Book getBookById(int id) {
        return bookTable.get(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookTable.put(book.getBookId(),book);
    }

    @Override
    public boolean deleteBookById(int id) {
        Book book = bookTable.remove(id); // This will remove the object. Also returns the object your removed
        if(book == null){
            return false;
        }else {
            return true;
        }

    }
}
