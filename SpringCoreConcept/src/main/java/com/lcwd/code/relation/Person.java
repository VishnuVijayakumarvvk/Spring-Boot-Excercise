package com.lcwd.code.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Qualifier("person")
@ComponentScan(basePackages = {"com.lcwd.code","student"})

public class Person {


    Animal animal;
    Student student;
    @Autowired
    public Person(@Qualifier("dog") Animal animal,@Qualifier("student")Student student){
        this.animal = animal;
        this.student = student;
    }
    public void playPerson(){
        animal.playAnimal();
       // student.syllabus();
    }
    public void playStudent(){
        student.syllabus();
    }
}
