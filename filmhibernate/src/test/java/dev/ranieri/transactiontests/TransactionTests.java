package dev.ranieri.transactiontests;

import dev.ranieri.entities.Movie;
import dev.ranieri.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class TransactionTests {

    @Test
    void atomicity(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        Movie m1 = new Movie(0,"A wrinkle in time",70,1);
        Movie m2 = new Movie(0,"Batman vs Superman",Integer.MAX_VALUE,10);
        Movie m3 = new Movie(0,"Jaws",90,1);

        sess.save(m1);
        sess.save(m3);
        sess.save(m2);

        sess.getTransaction().commit();

    }
}
