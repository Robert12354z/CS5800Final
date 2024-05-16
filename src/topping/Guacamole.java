package topping;

import Meal.Food;

public class Guacamole extends Topping {
    public Guacamole(Food food) {
        super(food);
    }

   

    @Override
    public String getName() {
        return super.getName() + "with Guacamole";
    }
}
