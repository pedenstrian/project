package com.lanou3g.utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory SESSION_FACTORY;

    static {
        SESSION_FACTORY = new Configuration().configure("config\\hibernate\\hibernate.cfg.xml").buildSessionFactory();
    }

    public static Session getCurrentSession(){
        return SESSION_FACTORY.getCurrentSession();
    }

    public static void main(String[] args) {
        getCurrentSession();
    }
}
