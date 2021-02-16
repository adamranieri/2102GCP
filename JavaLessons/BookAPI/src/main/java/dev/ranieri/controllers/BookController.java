package dev.ranieri.controllers;

import com.google.gson.Gson;
import dev.ranieri.daos.BookDaoLocal;
import dev.ranieri.entities.Book;
import dev.ranieri.services.BookService;
import dev.ranieri.services.BookServiceImpl;
import io.javalin.http.Handler;

import java.util.Set;

// All the logic in controller should deal with the API
// reading path parameters is a controller specific duty
// Controllers should call services to perform the actions
public class BookController {

    private BookService bookService = new BookServiceImpl(new BookDaoLocal());

    public Handler getAllBooksHandler = (ctx) ->{
            String t = ctx.queryParam("titleContains","NONE");// second value is default value
            if (t.equals("NONE")){
                Set<Book> allBooks = this.bookService.getAllBooks();
                Gson gson = new Gson();
                String booksJSON = gson.toJson(allBooks); // convert any Java object or collection of Java objects into a JSON String version
                ctx.result(booksJSON); // this does not execute immediately you could add more to end
                ctx.status(200); // signifies request was processed with no problems
            }else{
                Set<Book> books = this.bookService.getBooksByTitle(t);
                Gson gson = new Gson();
                String selectedBooksJSON = gson.toJson(books);
                ctx.result(selectedBooksJSON);
                ctx.status(200);
            }
    };

    // GET /books/4
    public Handler getBookByIdHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        Book book = this.bookService.getBookById(id);
        if(book == null){
            ctx.result("Book not found");
            ctx.status(404);
        }else{
            Gson gson = new Gson();
            String bookJSON = gson.toJson(book);
            ctx.result(bookJSON);
            ctx.status(200);
        }

    };

    // POST /books (the body will contain a JSON with the book information)
    public Handler createBookHandler = (ctx) ->{
        String body = ctx.body();
        Gson gson = new Gson();
        Book book = gson.fromJson(body,Book.class);// turn that Book JSON into a Java Book Object
        this.bookService.registerBook(book);
        ctx.result("You created a new book!!");
        ctx.status(201);
    };

    // PUT /books/20 => updates book number
    public Handler updateBookHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        String body = ctx.body();
        Gson gson = new Gson();
        Book book = gson.fromJson(body,Book.class);
        book.setBookId(id);// often redundant but the path id takes precedent
        this.bookService.updateBook(book);
    };

    public Handler deleteBookHandler = (ctx) ->{
        int id = Integer.parseInt(ctx.pathParam("id"));
        boolean deleted = this.bookService.deleteBookById(id);
        if(deleted){
            ctx.result("Book was deleted");
        }else{
            ctx.result("Oh no could not delete");
        }
    };

}
