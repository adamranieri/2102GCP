package dev.ranieri.SpringBookAPI;

import dev.ranieri.entities.Book;
import dev.ranieri.repos.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest // Create an application context and all the beans in it BEFORE you actually run your tests
class SpringBookApiApplicationTests {

	@Autowired // Hey SPRING I need bean of this type
	BookRepo bookRepo; // Spring Data  can read your interfaces an auto generate an implementation class

	@Test
	void create_book() {
		Book book = new Book(0,"To Kill a Mockingbird","Harper Lee",2,true,0);
		bookRepo.save(book);
		System.out.println(book);
	}

	@Test
	void get_book_by_ID() {
		// findby in Sprig Data returns an optional
		// Java version of a promise where it will either contain the object or an error message
		Book book = bookRepo.findById(10).get();
		System.out.println(book);
	}

	@Test
	void get_books_by_condition() {
		Set<Book> books = bookRepo.findBooksByBookCondition(1);
		System.out.println(books);
	}

	@Test
	void get_books_by_author() {
		Set<Book> books = bookRepo.findBooksByAuthorLike("ThisGuy");
		System.out.println(books);
	}

	@Test
	void get_books_between() {
		Set<Book> books = bookRepo.findBooksByBookConditionBetween(1,3);
		System.out.println(books);
	}

}
