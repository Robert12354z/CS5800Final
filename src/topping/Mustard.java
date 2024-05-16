package topping;

import Meal.Food;

public class Mustard extends Topping {
    public Mustard(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .1;
    }

    @Override
    public String getName() {
        return super.getName() + "with Mustard";
    }
}
