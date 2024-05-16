package topping;

import Meal.Food;

public class Relish extends Topping {
    public Relish(Food food) {
        super(food);
    }

  

    @Override
    public String getName() {
        return super.getName() + "with Relish";
    }
}
