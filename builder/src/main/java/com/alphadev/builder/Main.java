package com.alphadev.builder;

import com.alphadev.builder.director.Meal;
import com.alphadev.builder.director.MealDirector;
import com.alphadev.builder.director.NonVegMealBuilder;

public class Main {

    public static void main(String[] args) {
       /* Burger burger = new Burger.BurgerBuilder()
                .setSize("2")
                .setEgg("yes")
                .setExtraCheese(true)
                .build();
        System.out.println(burger);*/

        Meal meal = new MealDirector(new NonVegMealBuilder()).prepareMeal();
        System.out.println(meal);
    }
}
