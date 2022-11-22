package estructural.decorator.model.decoretors;

import estructural.decorator.model.Drink;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
}
