package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student s = new Student(100,"Shubham","Joshi","shubham@gmail.com");
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(s);
    	tx.commit();
    	session.close();
    	factory.close();
    }
}
