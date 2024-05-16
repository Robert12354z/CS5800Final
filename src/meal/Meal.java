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
        return this.name;
    }

    public Meal(Fats fat, Carbs carb, Protein protein) {
        this(fat,carb,protein,"");
    }

    public void setCarb(Carbs carb) {
        this.carb = carb;
    }

    public void setFat(Fats fat) {
        this.fat = fat;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public String toString(){
        return " Carb: " + carb.getString() + 
                " Protein: " + protein.getString() + 
                " Fat: " + fat.getString();
    }



    
}
