package com.lcwd.code.relation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cat")

public class Cat implements Animal{
    @Override
    public void playAnimal() {
        System.out.println("Cat is playing the game");
    }

}
