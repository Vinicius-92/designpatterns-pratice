package estructural.decorator.model;

public class Espresso implements Drink {
    @Override
    public void serve() {
        System.out.println("- Adding 50ml of espresso.");
    }

    @Override
    public Double getPrice() {
        return 1.5d;
    }
}
