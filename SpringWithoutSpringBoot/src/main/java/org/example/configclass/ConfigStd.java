package org.example.configclass;

import org.example.student.Student;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = {"org.example","org.example.student"})
public class ConfigStd {
    @Bean
    public Student student(){
        return new Student();
    }
}
