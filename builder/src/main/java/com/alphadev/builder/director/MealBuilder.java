package com.alphadev.builder.director;

public interface MealBuilder {
    public void addBriyani();
    public void addBread();
    public void addCoolDrink();
    public void addCurry();
    public Meal build();
}
