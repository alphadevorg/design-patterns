package com.alphadev.builder.director;

public class VegMealBuilder implements MealBuilder {
    private Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }


    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");
    }

    @Override
    public void addCoolDrink() {
        this.meal.setColdDrink("sprite");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg Curry");
    }

    @Override
    public Meal build() {
        return this.meal;
    }
}
