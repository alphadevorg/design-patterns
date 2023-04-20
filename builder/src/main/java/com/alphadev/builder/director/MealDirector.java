package com.alphadev.builder.director;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addBriyani();
        mealBuilder.addCoolDrink();
        mealBuilder.addCurry();
        return mealBuilder.build();
    }
}
