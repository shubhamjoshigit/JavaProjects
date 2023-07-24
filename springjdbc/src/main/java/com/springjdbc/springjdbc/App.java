package com.springjdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/pojo/config.xml");
        StudentDao studentdao = ctx.getBean("studentDaoImpl",StudentDaoImpl.class);
        List<Student> students = studentdao.getAllStudents();
        for(Student s : students) {
        System.out.println(s);
        }
        
        
    }
}
