package dev.ranieri.directortests;

import dev.ranieri.entities.Director;
import dev.ranieri.entities.Movie;
import dev.ranieri.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class DirectorTests {

    // states of an object in Hibernate
    // 1. transient
    // 2. persistent
    // 3. detached

    @Test
    void create_director(){
        Director director = new Director(0,"Adam","Kubrick"); // transient state
        // an object with an id of 0 is not saved to the database and is considered transient
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();

        sess.beginTransaction();
        sess.save(director); // this will give the object a non zero id
        // the object is now considered persistent
        sess.getTransaction().commit();

        sess.close();
        // Once the session is closed any object that was saved/updated or modified in that session
        // is now considered detached
        System.out.println(director);
    }

    @Test
    void get_director(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();

        sess.beginTransaction();
        Director director = sess.get(Director.class,1);// get the director with id 1
        director.setFname("Chris");
        sess.update(director);
        System.out.println(director);
        System.out.println(director.getMovies());
        sess.getTransaction().commit();
        sess.close();
    }

    // In hibernate we can either lazy fetch or eager fetch objects

    // Eager fetch means that when we get an object all nested objects in it are selected and returned immediately
    // one giant SQL query that performed a join and get me the movies immediately

    // Lazy fetch will NOT get all the nested objects immediately
    // It will only load the nested objects once they are actually used in a method

    @Test
    void get_director_lazy(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Director director = sess.get(Director.class,1);// get the director with id 1
        System.out.println(director);
        sess.close();
        System.out.println(director.getMovies());// with lazy loading the movies set is not populated until actually called in the code
        // lazy initialization exception
        // when you lazy load the object that you return is called a "proxy" object
        // the proxy does not have all the objects already in it
        // this exception occurs if you try to access nested objects AFTER the session is closed
        // Those objects were never actually pulled from the database so accessing them is impossible
        // By default Hibernate assumes nested objects to be lazy loaded
    }

    @Test
    void cascading(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        Director director = sess.get(Director.class,1);
        Movie movie = new Movie(0,"The Shining",100,1);
        director.getMovies().add(movie); // adding a new movie to this director's set of movies
        sess.update(director);// update the director object
        // I did not have to save movie directly into a table
        // Hibernate can see that there are new movies in the director object and save them accordingly
        sess.getTransaction().commit();
        sess.close();
    }







}
