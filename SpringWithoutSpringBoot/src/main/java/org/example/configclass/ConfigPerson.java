package org.example.configclass;

import org.example.student.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPerson {
    @Bean
    public Person person(){
        return new Person();
    }
}
