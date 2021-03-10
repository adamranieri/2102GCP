package dev.ranieri.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    // session factory
    // you should only ever have one per application
    // session factories are very large objects. Creating them multiple times would be very slow
    // A singleton in a class that you only ever have one of
    private static SessionFactory sf;
    public static SessionFactory getSessionFactory(){

        if(sf == null){
            Configuration cfg = new Configuration();
            sf = cfg.configure().buildSessionFactory();
        }
        return sf;
    }

}
