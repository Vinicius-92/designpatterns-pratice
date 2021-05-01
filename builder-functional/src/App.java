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
    }
}
