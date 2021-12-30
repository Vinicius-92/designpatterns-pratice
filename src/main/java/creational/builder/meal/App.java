package creational.builder.meal;

import creational.builder.meal.model.builder.FastFoodMealBuilder;

public class App {
    public static void main(String[] args) {
        var fastfood = new FastFoodMealBuilder()
                .withDrink("Coke")
                .andMain("Cheeseburger")
                .toTheSide("Some french fries")
                .andSomethingSweet("Apple pie")
                .finallyAToy("Rubik's Cube")
                .packItUp();
        System.out.println(fastfood);

        var justfries = new FastFoodMealBuilder()
                .toTheSide("Fries")
                .packItUp();
        System.out.println(justfries);
    }
}
