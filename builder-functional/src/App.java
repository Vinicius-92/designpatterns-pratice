import model.FastFoodMeal;

public class App {

    public static void main(String[] args) {


        System.out.println("New fast food meal test:");
        FastFoodMeal fast = new FastFoodMeal("Coke",
                "Cheese Burger",
                "Fries",
                "Strawberry Sundae",
                "Rubik's cube");
        System.out.println(fast);

        System.out.println("Fast food meal with builder:");
        FastFoodMeal fastBuild = new FastFoodMeal.Builder("Bacon Burger")
                .addDrink("Pepsi")
                .addGift("Pocket knife")
                .addSide("Onion Rings")
                .addDessert("Cake")
                .mealReady();
        System.out.println(fastBuild);
    }
}
