package dev.ranieri.hibernatetests;

import dev.ranieri.entities.Book;
import dev.ranieri.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class BasicHibernateTests {

    @Test
    void create_book(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();// the session interface is used to perform oprations with the database

        // Ideally you will use session to create transactions so that you could rollback any errors
        // easiliy in Java
        sess.getTransaction().begin();
        Book b = new Book(0,"Into The Wild","John Somebody",2,true,0);
        sess.save(b); // will save our book to the database
        sess.getTransaction().commit();
    }
}
