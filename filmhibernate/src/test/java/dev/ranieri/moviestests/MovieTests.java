package dev.ranieri.moviestests;


import dev.ranieri.entities.Movie;
import dev.ranieri.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MovieTests {

    @Test
    void create_movie(){
        Movie movie = new Movie(0,"Dr.Strangelove",95,1);
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        sess.save(movie);
        sess.getTransaction().commit();
        sess.close();
        System.out.println(movie);

    }

    // Hiberante provides three ways to make queries
    // 1 Criteria API very OOP centric
    // 2. HQL Hibernate Query Language SQL-esque syntax
    // 3. Native SQL (avoid using if possible)

    // reads do not require transactions
    @Test
    void criteria_query(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess =  sf.openSession();

        // Hibernate 5 Criteria API
        CriteriaBuilder criteriaBuilder = sess.getCriteriaBuilder();
        CriteriaQuery<Movie> query = criteriaBuilder.createQuery(Movie.class);
        Root<Movie> root = query.from(Movie.class);
        query.select(root);

        Query<Movie> q = sess.createQuery(query);
        List<Movie> results = q.getResultList();
        System.out.println(results);

        //Hibernate 4 Criteria API
        Criteria crit = sess.createCriteria(Movie.class);;
        crit.add(Restrictions.between("runtime",99,150)); // adds a restriction
        crit.add(Restrictions.like("title","%Odyssey%")); // % signs are wild cards
        // to only get movies between that runtime
        List<Movie> movies = crit.list();
        System.out.println(movies);
        // create a criteria object
        // this objects is used to create q query that will get records from the database and return them
        // as a list of objects
        // if you do nothing it will get back  all the records in that table
        // the resitrictions are addititve
        sess.close();
    }

    @Test
    void hql_query(){
        // HQL is slightly more OOP version of SQL
        // Java sql hybrid
        // advantages to HQL
        // An hql query will work on any SQL database
        // if you change SQL diaclects or do not know the final version of SQL your aplication will use it will work the same
        // some people think the syntax is a little bit easier.

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        String hql = "FROM Movie m WHERE m.runtime = 300 "; // every in the hql is written as if you know NOTHING about the acutal names of the columns
        // and tables in SQL. BUT you know the entities

        Query query = sess.createQuery(hql);
        List<Movie> movies = query.list();
        System.out.println(movies);

    }

    // avoid if possible
    @Test
    void sql_query(){
        // You can execute pure SQL statements
        // 1. Tied to a specific dialect of SQL
        // 2. Your results are not automatically turned into nice objects to work with
        // get back that result set from JDBC
        String sql = "SELECT * FROM movie";
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sess = sf.openSession();
        Query query = sess.createSQLQuery(sql);
        List<Object> movies = query.list(); // this lies to you
        System.out.println(movies);
    }


}
