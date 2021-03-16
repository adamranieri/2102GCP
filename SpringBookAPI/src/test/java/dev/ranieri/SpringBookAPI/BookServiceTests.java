package dev.ranieri.SpringBookAPI;

import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class BookServiceTests {

    @Autowired // Will find any bean. Auto generated beans or custom implemented beans
    BookService bookService;

    @Test
    public void get_all_books(){
        Set<Book> books = bookService.getAllBooks();
        System.out.println(books);

    }


}
