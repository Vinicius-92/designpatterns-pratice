package model;

public class FastFoodMeal {

    final private String main;
    final private String drink;
    final private String side;
    final private String dessert;
    final private String gift;

    public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public String getMain() {
        return main;
    }

    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public String getGift() {
        return gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal{" +
                "main='" + main + '\'' +
                ", drink='" + drink + '\'' +
                ", side='" + side + '\'' +
                ", dessert='" + dessert + '\'' +
                ", gift='" + gift + '\'' +
                '}';
    }

    public static class Builder {

        // Mandatory
        final private String main;
        //Optional
        private String drink;
        private String side;
        private String dessert;
        private String gift;

        public Builder(String main) {
            this.main = main;
        }

        public Builder addDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder addSide(String side) {
            this.side = side;
            return this;
        }

        public Builder addDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder addGift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal mealReady() {
            return new FastFoodMeal(main, drink, side, dessert, gift);
        }
    }
}
