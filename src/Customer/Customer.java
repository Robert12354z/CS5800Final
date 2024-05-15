package Customer;

import meal.DietRestriction;

public class Customer {

    private String name;
    private String address;
    private String county;
    private DietPlan dietRestriction;

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    //This method is used to set the diet restriction of the customer
    //Returns the diet restriction of the customer(All proteins, carbs and fats) he/she can consume
    public Finalize finalizing(){
        MacroFactory macroFactory = MacroAbstract.getInstance().getFactory(dietRestriction);
        Protein protein = macroFactory.createProteins();
        Carbs carb = macroFactory.createCarbs();
        Fats fat = macroFactory.createFats();
        return new Finalize(protein, carb, fat);
    }

    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
    
}
