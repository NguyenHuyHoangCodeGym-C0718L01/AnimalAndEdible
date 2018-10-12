package com.company;

import java.util.ArrayList;
import java.util.List;

public class AbstractTest {
    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Tiger());
        animalList.add(new Chicken());

        for(Animal animal : animalList){
            System.out.println(animal.makeSound());
        }
    }
}
