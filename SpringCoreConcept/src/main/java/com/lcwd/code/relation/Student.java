package com.lcwd.code.relation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public Student() {
    }

    public void syllabus(){
        System.out.println("This is the syllabus of the whole semister: ");
    }
}
