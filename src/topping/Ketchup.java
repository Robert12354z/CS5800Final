package topping;

import meal.Food;

public class Ketchup extends Topping {
    public Ketchup(Food food) {
        super(food);
    }

  

    @Override
    public String getName() {
        return super.getName() + "with Ketchup";
    }
}
