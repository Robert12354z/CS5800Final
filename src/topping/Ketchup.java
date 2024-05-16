package topping;

import Meal.Food;

public class Ketchup extends Topping {
    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .2;
    }

    @Override
    public String getName() {
        return super.getName() + "with Ketchup";
    }
}
