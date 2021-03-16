package dev.ranieri.SpringBookAPI;

import dev.ranieri.entities.Book;
import dev.ranieri.repos.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional // automatically rollback any changes your tests make to the database AFTER each test
public class PersistenceTests {

    @Autowired
    BookRepo bookRepo;

    @Test
    @Rollback
    public void create_book(){
        Book book = new Book(0,"On Walden Pond","Henry David Thoreau",2,true,0);
        bookRepo.save(book);
        System.out.println(book);
    }

    @Test
    @Commit
    public void create_book_persist(){
        Book book = new Book(0,"The Hunger Games","Susan Collins",2,true,0);
        bookRepo.save(book);
        System.out.println(book);
    }


}
