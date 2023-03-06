package org.example;

import org.example.configclass.ConfigStd;
import org.example.student.Person;
import org.example.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigStd.class);
        Student st=context.getBean(Student.class);
        st.studentPLaying();
        Person p=context.getBean(Person.class);
        p.playPerson();
        System.out.println( "The code is completed... Spring witjout springboot" );
    }
}
