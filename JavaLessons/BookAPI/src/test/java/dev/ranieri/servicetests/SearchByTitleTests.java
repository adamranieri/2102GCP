package dev.ranieri.servicetests;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

// Mocking in tests
// A lot of times when we test service methods wehave to assume certain values or assume certain dependencies already work
// A service test would not pass if the DAO it uses to save things does not work
// Your service logic could be impeccable you get a failure
// Mocking is a way of faking the returns of a method so that you can continue working on a particular piece of functionality

@ExtendWith(MockitoExtension.class) //  these TOP OF CLASS ANNOTATIONS HAVE KILLED ME SO MANY TIMES
public class SearchByTitleTests {

    @Mock
    BookDAO bookDAO = null;


    private BookService bookService = null;

    @BeforeEach // this is a method that will run before each test
    void setUp(){
        // fake books
        Book greatGatsby = new Book(1,"The Great Gatsby", "F. Scott Fitzgerald",1, true,0);
        Book incredibleJourney = new Book(2,"Incredible Journey", "Sheila Burnford",1, true,0);
        Book hp1 = new Book(3,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling",1, true,0);
        Book hp2 = new Book(4,"Harry Potter and the Chamber of Secrets", "J.K. Rowling",1, true,0);
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(greatGatsby);
        bookSet.add(incredibleJourney);
        bookSet.add(hp1);
        bookSet.add(hp2);

        // whenever we call bookDAO.getAllBooks will return this predefined set of books. DOES acutally use the DAO object
        Mockito.when(bookDAO.getAllBooks()).thenReturn(bookSet); // DOES NOT TEST GETALLBOOKS AT ALL
        // Mocking adds consistency to methods calls
        this.bookService = new BookServiceImpl(this.bookDAO); // this will create our book service using the mocked dao
    }

    @Test
    void search_by_title(){
        Set<Book>books = this.bookService.getBooksByTitle("Harry Potter");
        System.out.println(books);
        Assertions.assertEquals(2,books.size());
    }

    @Test
    void search_by_title_case_insensitive(){
        Set<Book>books = this.bookService.getBooksByTitle("hArrY POTTER");
        System.out.println(books);
        Assertions.assertEquals(2,books.size());
    }

}
