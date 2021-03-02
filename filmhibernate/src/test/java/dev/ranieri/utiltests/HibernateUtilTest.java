package dev.ranieri.utiltests;

import dev.ranieri.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

public class HibernateUtilTest {

    @Test
    void creates_sessionFactory(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        System.out.println(sf);
    }
}
