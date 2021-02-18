package dev.ranieri.services;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class BookServiceImpl implements  BookService{

    private static Logger logger = Logger.getLogger(BookServiceImpl.class.getName()); // when the logger writes
    // it will say what class the log was from

    // Our service is going to need a dao to get and save books
    // BookDAO is a dependency
    // our service will use a DAO to save things
    private BookDAO bdao;

    // Dependency injection
    // A service is created by passing in the dependencies it needs
    public BookServiceImpl(BookDAO bookDAO){
        this.bdao = bookDAO;
    }

    @Override
    public Book registerBook(Book book) {
        book.setAvailable(true); // Business logic
        book.setReturnDate(0); // specific to the application
        this.bdao.createBook(book);
        return book;
    }

    @Override
    public Set<Book> getAllBooks() {
        return this.bdao.getAllBooks();
    }

    @Override
    public Set<Book> getBooksByTitle(String title) {
        Set<Book> allBooks = this.bdao.getAllBooks();
        Set<Book> selectedBooks = new HashSet<Book>();

        for(Book b : allBooks){
            if(b.getTitle().toLowerCase().contains(title.toLowerCase())){
                selectedBooks.add(b);
            }
        }

        return selectedBooks;
    }


    @Override
    public Book getBookById(int id) {
        return this.bdao.getBookById(id);
    }

    @Override
    public Book updateBook(Book book) {
        // You have complete access to those DAO methods USE THEM TO MAKE YOU LIFE EASY
        Book oldBook = this.bdao.getBookById(book.getBookId());// the current book in the database

        //this if statement is essenitally seeing if the book was checked out
        if(oldBook.isAvailable() == true && book.isAvailable() == false){
            book.setReturnDate(System.currentTimeMillis()/1000 +604_800);
            logger.info("the book with id " +book.getBookId() +" was checked out" );
        }

        // this if statement essentially seeing if the book was being checked in
        if(oldBook.isAvailable() == false && book.isAvailable() == true){
            book.setReturnDate(0);
            logger.info("the book with id " +book.getBookId() +" was checked in" );
        }

        this.bdao.updateBook(book);

        return book;
    }

    @Override
    public boolean deleteBookById(int id) {
        return this.bdao.deleteBookById(id);
    }
}
