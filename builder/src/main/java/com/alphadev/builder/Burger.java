package com.alphadev.builder;

public class Burger {
    private String size;
    private String egg;
    private boolean extraCheese;
    private boolean mavonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder ) {
        //logic to be added for the mandatory fields and set the values for the burger class
        this.size = burgerBuilder.size;
        this.egg = burgerBuilder.egg;
        this.extraCheese = burgerBuilder.extraCheese;
        this.mavonese = burgerBuilder.mavonese;
        this.onion = burgerBuilder.onion;
        this.lettuce = burgerBuilder.lettuce;
    }

    public String getSize() {
        return size;
    }

    public String getEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMavonese() {
        return mavonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private String egg;
        private boolean extraCheese;
        private boolean mavonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder setEgg(String egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder setMavonese(boolean mavonese) {
            this.mavonese = mavonese;
            return this;
        }

        public BurgerBuilder setOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder setLettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg='" + egg + '\'' +
                ", extraCheese=" + extraCheese +
                ", mavonese=" + mavonese +
                ", onion=" + onion +
                ", lettuce=" + lettuce +
                '}';
    }
}







