package Customer;

import driver.SouthernCaliforniaCounty;

public class Customer {

    private String name;
    private String address;
    private SouthernCaliforniaCounty county;
    private DietPlan dietRestriction;

    public Customer(String name, String address, SouthernCaliforniaCounty county, DietPlan dietPlan) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietRestriction = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public SouthernCaliforniaCounty getCounty() {
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
                ", dietRestriction=" + dietRestriction +
                '}';
    }
    
}
