package com.lcwd.code;

import com.lcwd.code.relation.Animal;
import com.lcwd.code.relation.Cat;
import com.lcwd.code.relation.Dog;
import com.lcwd.code.relation.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.lcwd.code","student"})
//@ComponentScan(basePackages = {"com.lcwd.code","relation"})
public class SpringCoreConceptApplication {

	public static void main(String[] args) {
//		Animal animal = new Cat();
//		Person person= new Person(animal);
//		person.playPerson();

		ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
		Person person = context.getBean("person",Person.class);
		person.playPerson();
		person.playStudent();
		Animal cat = context.getBean("cat",Animal.class);
		cat.playAnimal();
		Animal dog = context.getBean("dog",Animal.class);
		dog.playAnimal();
	}

}
