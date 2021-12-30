package creational.builder.meal.model.builder;

import creational.builder.meal.model.FastFoodMeal;

public class FastFoodMealBuilder {
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder() {
    }

    public FastFoodMealBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMealBuilder andMain(String main) {
        this.main = main;
        return this;
    }

    public FastFoodMealBuilder toTheSide(String side) {
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder andSomethingSweet(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder finallyAToy(String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMeal packItUp() {
        return new FastFoodMeal(drink, main, side, dessert, gift);
    }
}
