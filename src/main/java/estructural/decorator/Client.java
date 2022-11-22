package estructural.decorator;

import estructural.decorator.model.Drink;
import estructural.decorator.model.Espresso;
import estructural.decorator.model.Tea;
import estructural.decorator.model.decoretors.DoubleDrink;
import estructural.decorator.model.decoretors.Milk;

public class Client {
    public static void order(String name, Drink drink) {
        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        order("Espresso", new Espresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Espresso()));
        order("Cafe Au Lait", new Milk(new Espresso()));
        order("English Tea", new Milk(new Tea()));
    }
}
