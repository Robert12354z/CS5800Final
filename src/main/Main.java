package main;

import java.sql.Time;

import Customer.Customer;
import Customer.DietPlan;
import Customer.Finalize;
import Establisments.Restaurant;
import driver.SouthernCaliforniaCounty;

public class Main {
    public static void main(String[] args) {
        DietPlan paleo = DietPlan.PALEO;
        DietPlan vegan = DietPlan.VEGAN;
        DietPlan nutAll = DietPlan.NUTALL;
        DietPlan noRestriction = DietPlan.NORESTRICTION;


        CPPFoodDelivery cpp = CPPFoodDelivery.getInstance();
        Time openingTime = new Time(12);
        Time closingTime = new Time(24);

        //Register Restaurants
        Restaurant res1 = new Restaurant("Mcdonalds","123 Seasame Street",SouthernCaliforniaCounty.LA_COUNTY, openingTime, closingTime, "Mexican");

    }
    
}
