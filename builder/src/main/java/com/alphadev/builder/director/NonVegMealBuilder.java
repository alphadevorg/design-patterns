package com.alphadev.builder.director;

public class NonVegMealBuilder implements MealBuilder{
    private Meal meal;

    public NonVegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void addBriyani() {
        this.meal.setBriyani("Chicken");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addCoolDrink() {
        this.meal.setColdDrink("pepsi");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Non Veg Curry");
    }

    @Override
    public Meal build() {
        return this.meal;
    }
}
