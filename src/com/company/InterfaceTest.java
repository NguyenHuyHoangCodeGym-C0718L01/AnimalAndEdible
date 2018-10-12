package com.company;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
    public static void main(String[] args){
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Apple());
        fruitList.add(new Orange());

        for(Fruit fruit : fruitList){
            System.out.println(fruit.howToEat());
        }

        List<Edible> edibleList = new ArrayList<>();
        edibleList.add(new Apple());
        edibleList.add(new Orange());
        edibleList.add(new Chicken());

        for(Edible edible : edibleList){
            System.out.println(edible.howToEat());
        }
    }
}
