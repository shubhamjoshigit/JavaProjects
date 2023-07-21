package com.student.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        Student s = new Student(100, "Shubham Joshi", "joshishubham18@gmail.com");
        Transaction tx = session.beginTransaction();
        session.save(s);
        tx.commit();
        session.close();
        factory.close();
    }
}
