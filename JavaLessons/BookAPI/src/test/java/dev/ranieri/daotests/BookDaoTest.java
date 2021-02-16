package dev.ranieri.daotests;

import dev.ranieri.daos.BookDAO;
import dev.ranieri.daos.BookDaoLocal;
import dev.ranieri.entities.Book;
import org.junit.jupiter.api.*;

import java.util.Set;

// Unless you specifically use annotations to specify order they will not run in a pre-determined way
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BookDaoTest {

    private static BookDAO bdao = new BookDaoLocal();
    private static Book testBook = null;

    @Test
    @Order(1)
    void create_book(){
        // Anytime a book has an ID of zero it menas that is is not saved or persisted somewhere
        // Software convention
        Book angelasAshes = new Book(0, "Angela's Ashes", "Frank McCourt",2,true,0);
        bdao.createBook(angelasAshes); // save or persist
        System.out.println(angelasAshes); // the id should NOT be zero
        testBook = angelasAshes;
        Assertions.assertNotEquals(0,angelasAshes.getBookId());

    }

    @Test
    @Order(2)
    void get_book_by_id(){
        int id = testBook.getBookId(); // WE KNOW that this book exists
        Book book = bdao.getBookById(id);
        //                      expected        vs      actual
        Assertions.assertEquals(testBook.getTitle(), book.getTitle());
        System.out.println("The book we retrived was " + book);
    }

    @Test
    @Order(3)
    void update_book(){
        Book book = bdao.getBookById(testBook.getBookId()); // grabbed the book from the database
        book.setCondition(3); // changed the condition
        bdao.updateBook(book); // should update the book to have a worse condition (in the database the book should be update)

        Book updatedBook = bdao.getBookById(testBook.getBookId()); // fetch that same book again
        Assertions.assertEquals(3,updatedBook.getCondition());

    }

    @Test
    @Order(4)
    void get_all_books(){

        Book b1 = new Book(0, "The Outsiders", "S. E. Hinton",1,true,0);
        Book b2 = new Book(0, "One Flew Over The Cuckoo's Nest", "Ken Kesey", 1, true,0);
        Book b3 = new Book(0, "A Christmas Carol", "A Charles Dickens", 3, true,0);

        bdao.createBook(b1);
        bdao.createBook(b2);
        bdao.createBook(b3);

        Set<Book> allBooks = bdao.getAllBooks();
        Assertions.assertTrue(allBooks.size()>2);
    }

    @Test
    @Order(5)
    void delete_book_by_id(){
        int id = testBook.getBookId();
        boolean result = bdao.deleteBookById(id); // delete that book
        Assertions.assertTrue(result);
    }

}
