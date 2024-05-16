package topping;

import meal.Food;

public abstract class Topping implements Food {

    private Food food;

    public Topping(Food food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName();
    }
}
