package dev.ranieri.controllers;

import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Set;

@Component
//@Controller // Tells spring to read the methods in this class to genereate a controller bean
// by default @Controller is designed to return a view now a JSON String
// A holdover of Spring being used for server side rendering (the server sends back HTML)
@RestController// automtaically appends @ReponseBody to all methods in the class.
public class BookController {

    @Autowired
    BookService bookService;

    // Spring will create a get route using that path
    @GetMapping("/books")
    //@ResponseBody // Spring will automatically convert any returns into JSON for you
    public Set<Book> retrieveAllBooks(){
        Set<Book> books = this.bookService.getAllBooks();
        return books;
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id){
        Book book = this.bookService.getBookById(id);
        return book;
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book){ // Spring will automatically read the json in the body
        // and turn it into a Java Object
        this.bookService.registerBook(book);
        return book;
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book){
        book.setBookId(id);
        this.bookService.updateBook(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public Boolean deleteBookById(@PathVariable int id) { // in spring you cannot returns primitives
        Boolean result = this.bookService.deleteBookById(id);
        return result;
    }


}
