package dev.ranieri.daos;

import dev.ranieri.entities.Book;
import dev.ranieri.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Set;

public class BookDaoHibernate implements  BookDAO{

    private SessionFactory sf = HibernateUtil.getSessionFactory();

    @Override
    public Book createBook(Book book) {
        Session sess = sf.openSession();
        sess.getTransaction().begin();
        sess.save(book); // it changes the object to have the new id
        sess.getTransaction().commit();
        sess.close();// you chould close your session
        return book;
    }

    @Override
    public Set<Book> getAllBooks() {
        return null;
    }

    @Override
    public Book getBookById(int id) {
        Session sess = sf.openSession();
        Book b = sess.get(Book.class,id);
        sess.close();
        return b;
    }

    @Override
    public Book updateBook(Book book) {
        Session sess = sf.openSession();
        sess.getTransaction().begin();
        sess.update(book);
        sess.getTransaction().commit();
        sess.close();
        return book;
    }

    @Override
    public boolean deleteBookById(int id) {
        try{
            Session sess = sf.openSession();
            sess.getTransaction().begin();
            sess.delete(this.getBookById(id));
            sess.getTransaction().commit();
            sess.close();
            return true;
        }catch (HibernateException he){ // in hibernate all exceptions are a runtime HobernateException
            he.printStackTrace();
            return false;
        }

    }

}
