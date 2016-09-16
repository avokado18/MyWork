package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by 1 on 16.09.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
