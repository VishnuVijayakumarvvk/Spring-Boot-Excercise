package com.lcwd.code.relation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal  {

    @Override
    public void playAnimal() {
        System.out.println("Dog is PLaying the game: ");
    }

}
