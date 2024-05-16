package topping;

import meal.Food;

public class Relish extends Topping {
    public Relish(Food food) {
        super(food);
    }

  

    @Override
    public String getName() {
        return super.getName() + "with Relish";
    }
}
