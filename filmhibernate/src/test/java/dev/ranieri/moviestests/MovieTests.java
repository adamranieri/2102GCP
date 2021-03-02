package dev.ranieri.moviestests;


import dev.ranieri.entities.Movie;
import dev.ranieri.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class MovieTests {

    @Test
    void create_movie(){
        Movie movie = new Movie(0,"2021 a GCP Odyssey 2: electric boogaloo",300,1);
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        sess.save(movie);
        sess.getTransaction().commit();
        sess.close();
        System.out.println(movie);

    }

}
