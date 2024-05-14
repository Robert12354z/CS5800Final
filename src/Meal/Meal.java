package Meal;

public class Meal implements Food {

    private Fat fat;
    private Carb carb;
    private Protein protein;
    private int price;
    private String name;

    public Meal(Fat fat, Carb carb, Protein protein, int price, String name) {
        this.fat = fat;
        this.carb = carb;
        this.protein = protein;
        this.price = price;
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
