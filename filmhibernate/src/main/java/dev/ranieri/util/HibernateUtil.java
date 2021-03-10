package dev.ranieri.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sf;
    public static SessionFactory getSessionFactory(){

        if(sf == null){
            Configuration cfg = new Configuration();
            sf = cfg.configure().buildSessionFactory();
        }
        return sf;
    }
}
