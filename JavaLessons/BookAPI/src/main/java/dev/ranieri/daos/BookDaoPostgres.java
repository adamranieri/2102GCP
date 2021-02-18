package dev.ranieri.daos;
import dev.ranieri.entities.Book;
import dev.ranieri.utils.ConnectionUtil;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class BookDaoPostgres implements BookDAO{

    private Logger logger = Logger.getLogger(BookDaoPostgres.class.getName());

    @Override
    public Book createBook(Book book) {

        // try with resources syntax
        // No matter what happens Java will close that object to prevent any resource leaks
        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "insert into book (title,author,book_condition,available,return_date) values (?,?,?,?,?)"; // Anything
            // that requires you to write precise string is immediately very likely to cause bugs
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // when you create something
            ps.setString(1, book.getTitle());// for the first ? put the title
            ps.setString(2,book.getAuthor());
            ps.setInt(3,book.getCondition());
            ps.setBoolean(4,book.isAvailable());
            ps.setLong(5,book.getReturnDate());

            ps.execute(); // execute the sql statement

            // result set is a cursor that starts before the actual first element
            ResultSet rs = ps.getGeneratedKeys(); // return the value of the generated key // the id
            rs.next(); // the first element
            int key = rs.getInt("book_id");
            book.setBookId(key);
            return  book;

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            logger.error("unable to create book",sqlException);
            return null;
        }

    }

    @Override
    public Set<Book> getAllBooks() {

        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "select * from book";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Set<Book> books = new HashSet<Book>();
            // while there exists books create a new book and store the infromation into the new book
            while (rs.next()){
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setCondition(rs.getInt("book_condition"));
                book.setAvailable(rs.getBoolean("available"));
                book.setReturnDate(rs.getLong("return_date"));
                books.add(book);
            }
           return  books;

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            logger.error("unable to get all books",sqlException);
            return null;
        }

    }

    @Override
    public Book getBookById(int id) {

        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "select * from book where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            rs.next();  // move cursor to first actual book;

            Book book = new Book();
            book.setBookId(rs.getInt("book_id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setCondition(rs.getInt("book_condition"));
            book.setAvailable(rs.getBoolean("available"));
            book.setReturnDate(rs.getLong("return_date"));

            return  book;

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            logger.error("unable to get book with id " + id, sqlException);
            return null;
        }

    }

    @Override
    public Book updateBook(Book book) {

        try(Connection conn = ConnectionUtil.createConnection()){
            // sql using nice prepared statements

            String sql = "update book set title = ?, author = ?, book_condition = ?, available = ?, return_date =? where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,book.getTitle());
            ps.setString(2,book.getAuthor());
            ps.setInt(3, book.getCondition());
            ps.setBoolean(4,book.isAvailable());
            ps.setLong(5, book.getReturnDate());
            ps.setInt(6, book.getBookId());
            ps.executeUpdate();

            // SQL injection is anytime you trick a web server into executing a SQL statement it did not intend to
            // write a string and just update the string directly with your values
//            String sql = "update book set title = '" +book.getTitle()+ "', " +
//                    "author = '"+book.getAuthor()+"', " +
//                    "book_condition = "+ book.getCondition()+", " +
//                    "available = "+book.isAvailable()+", " +
//                    "return_date = "+book.getReturnDate() +
//                    "where book_id =" + book.getBookId();
//
//            System.out.println(sql);
//
//            Statement statement = conn.createStatement();//NEVER USE JUST STATEMENT
//            statement.execute(sql);
            return  book;

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            logger.error("unable to update book " + book.getBookId(),sqlException);
            return null;
        }

    }

    @Override
    public boolean deleteBookById(int id) {

        try(Connection conn = ConnectionUtil.createConnection()){
            String sql = "delete from book where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
            return true;

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            logger.error("unable to delete book with id " + id,sqlException);
            return false;
        }

    }
}
