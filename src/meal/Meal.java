package Meal;

import Customer.Carbs;
import Customer.Fats;
import Customer.Protein;


public class Meal implements Food {

    private Fats fat;
    private Carbs carb;
    private Protein protein; 
    private String name;

    public Meal(Fats fat, Carbs carb, Protein protein, String name) {
        this.fat = fat;
        this.carb = carb;
        this.protein = protein;
        this.name = name;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
