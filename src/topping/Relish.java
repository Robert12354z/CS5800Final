package topping;

import Meal.Food;


public class Relish extends Topping {
    public Relish(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + .3;
    }

    @Override
    public String getName() {
        return super.getName() + "with Relish";
    }

    @Override
    public String toString(){return "Relish"; }
}
