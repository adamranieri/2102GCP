package dev.ranieri.servicetests;

import dev.ranieri.daos.BookDaoLocal;
import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookServiceTests {

    private static BookService bserv = new BookServiceImpl(new BookDaoLocal());
    private static Book testBook = null;

    @Test
    @Order(1)
    void register_book(){
        Book book = new Book(0,"Harry Potter", "J.K. Rowling",3,false,3928239);
        bserv.registerBook(book); //our service is performing some book validation
        // that validation is a business logic that applies only to the community library
        System.out.println(book);

        Assertions.assertNotEquals(0,book.getBookId());
        Assertions.assertTrue(book.isAvailable());
        testBook = book;
    }

    // - people are given a week to return a book (There is no penalty for not doing so)
    // when you checkout a book the availablilty will switch from true => false
    // a new returnDate of one week of future should set on the book
    @Test
    @Order(2)
    void update_book_checkout(){

        Book book = new Book(testBook.getBookId(),"Harry Potter", "J.K. Rowling", 3, false, 0);
        bserv.updateBook(book); //
        // return date should be seven days in the future when you update the book
        // seconds in week it would be 604,800
        System.out.println(book);
        Assertions.assertEquals(System.currentTimeMillis()/1000 +604_800, book.getReturnDate(),100);
    }
}
