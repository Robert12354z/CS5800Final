package Customer;

public class Finalize {

    private Protein protein;
    private Carbs carb;
    private Fats fat;
    
    public Finalize(Protein protein, Carbs carb, Fats fat) {
        this.protein = protein;
        this.carb = carb;
        this.fat = fat;
    }

    public Protein getProtein() {
        return protein;
    }

    public Carbs getCarb() {
        return carb;
    }

    public Fats getFat() {
        return fat;
    }

    

    public String toString() {
        return "Carb: " + carb.getString() + "\n" +
                "Protein: " + protein.getString() + "\n" +
                "Fat: " + fat.getString();
    }

}
