package dev.ranieri.services;

import dev.ranieri.entities.Book;
import dev.ranieri.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Component
@Service
public class BookServiceImpl implements  BookService{

    @Autowired // Spring will inject a bean of this interface into this class when you use it
    BookRepo bookRepo;

    @Override
    public Book registerBook(Book book) {
        this.bookRepo.save(book);
        return book;
    }

    @Override
    public Book getBookById(int id) {
        Book book = this.bookRepo.findById(id).get();
        return book;
    }

    @Override
    public Set<Book> getAllBooks() {
        Set<Book> books =  new HashSet<Book>((Collection<? extends Book>) this.bookRepo.findAll());
        return books;
    }

    @Override
    public Book updateBook(Book book) {
        this.bookRepo.save(book);// There is no specific update in Spring Data
        // save method is essentially an overwrite
        return book;
    }

    @Override
    public boolean deleteBookById(int id) {
        this.bookRepo.deleteById(id);
        return true;
    }
}
