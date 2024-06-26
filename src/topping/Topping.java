package topping;

import Meal.Food;

public abstract class Topping implements Food {

    private Food food;

    public Topping(Food food) {
        this.food = food;
    }

    public Food unwrap(){
        return food;
    }

    @Override
    public double getPrice() {
        return food.getPrice();
    }

    @Override
    public String getName() {
        return food.getName();
    }

}
