package com.alphadev.decorator;

public class JalepanoDecorator extends PizzaDecorator{
    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake() {
        return pizza.bake() + addJalepano();
    }

    private String addJalepano() {
        return "jalepenop";
    }
}
