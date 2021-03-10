package dev.ranieri.entities;

import javax.persistence.*;

// An entity is a class/object that is designed to be saved/persisted somewhere
// Their job is to hold information
// The fields in an entity usually have a 1-1 match to a column in a SQL database
// entities usually hav very little logic in them
// Should be a Java Bean (Anything not a bean is POJO Plain Old Java Object)
// 1. all fields must be private
// 2. you must have public getters and setters
// 3. you need to have a no arguments (You can have more constructors)
// 4. Technically you are supposed implement serializable
@Entity
@Table(name= "book") // whatever the table name is in the database
public class Book {

    @Id // this will mark the field as the primary key for the object
    @GeneratedValue(strategy = GenerationType.IDENTITY) // let hibernate know how this field is populated
    @Column(name ="book_id")
    private int bookId; // primary key (Every book has a unique id)

    @Column(name ="title")
    private String title;

    @Column(name ="author")
    private String author;

    @Column(name ="book_condition")
    private int condition; // 1 = like new, 2 = used, 3 = worn down, 4= unusuable/lost

    @Column(name ="available")
    private boolean available; // true = in the library, false = someone checked it out if the book is checked out or not

    @Column(name ="return_date")
    private long returnDate; // DO NOT USE the DATE class in a programming
    // dates are best stored as seconds from 1970 jan 1 midnight (unix epoch)
    public Book() {
    }

    public Book(int bookId, String title, String author, int condition, boolean available, long returnDate) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.condition = condition;
        this.available = available;
        this.returnDate = returnDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(long returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", condition=" + condition +
                ", available=" + available +
                ", returnDate=" + returnDate +
                '}';
    }

}
