package main;

import java.sql.Time;

import Customer.Customer;
import Customer.DietPlan;
import Customer.Finalize;
import Establisments.Restaurant;
import driver.Driver;
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
        Restaurant res2 = new Restaurant("In-N-Out","253 Mcdonald Ave",SouthernCaliforniaCounty.ORANGE_COUNTY, openingTime, closingTime, "American");
        Restaurant res3 = new Restaurant("Panda Express","123 Panda Lane",SouthernCaliforniaCounty.SAN_BERNARDINO_COUNTY, openingTime, closingTime, "Chinese");
        Restaurant res4 = new Restaurant("Taco Bell","123 Taco Lane",SouthernCaliforniaCounty.LA_COUNTY, openingTime, closingTime, "Mexican");

        cpp.registerRestaurant(res1);
        cpp.registerRestaurant(res2);
        cpp.registerRestaurant(res3);
        cpp.registerRestaurant(res4);

        //Register Customers
        Customer john = new Customer("John", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, paleo);
        Customer maddy = new Customer("Maddy", "225 Booker Ave, Santa Ana, CA 92707",SouthernCaliforniaCounty.ORANGE_COUNTY, vegan);
        Customer rebecca = new Customer("Rebecca", "1225 Panda St, Riverside, CA 92501",SouthernCaliforniaCounty.SAN_BERNARDINO_COUNTY, nutAll);
        Customer jason = new Customer("Jason", "154 Purple Lane, Los Angeles, CA 90001",SouthernCaliforniaCounty.LA_COUNTY, noRestriction);
        Customer jessie = new Customer("Jessie", "9002 Red St, Fullertom, CA 92831",SouthernCaliforniaCounty.ORANGE_COUNTY, paleo);
        Customer ruben = new Customer("Ruben", "1222 Hickleberry Rd, Whitter, CA 92312", SouthernCaliforniaCounty.LA_COUNTY, noRestriction);
        Customer nami = new Customer("Nami", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, paleo);
        Customer casper = new Customer("Casper", "225 Booker Ave, Santa Ana, CA 92707",SouthernCaliforniaCounty.ORANGE_COUNTY, vegan);
        Customer robert = new Customer("Robert", "1225 Fish St, Hollywood, CA 92501",SouthernCaliforniaCounty.SAN_BERNARDINO_COUNTY, nutAll);
        Customer pikachu = new Customer("Pikachu", "154 Yellow Lane, Los Angeles, CA 90001",SouthernCaliforniaCounty.LA_COUNTY, noRestriction);

        cpp.registerCustomer(john);
        cpp.registerCustomer(maddy);
        cpp.registerCustomer(rebecca);
        cpp.registerCustomer(jason);
        cpp.registerCustomer(jessie);
        cpp.registerCustomer(ruben);
        cpp.registerCustomer(nami);
        cpp.registerCustomer(casper);
        cpp.registerCustomer(robert);
        cpp.registerCustomer(pikachu);

        //Register Drivers
        Driver driverRachel = new Driver("Rachel", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, "3rd Shift");
        Driver driverMac = new Driver("Mac", "225 Booker Ave, Santa Ana, CA 92707",SouthernCaliforniaCounty.ORANGE_COUNTY, "2nd Shift");
        Driver driver3 = new Driver("Rebecca", "1225 Panda St, Riverside, CA 92501",SouthernCaliforniaCounty.SAN_BERNARDINO_COUNTY, "1st Shift");
        Driver driver4 = new Driver("Jason", "154 Purple Lane, Los Angeles, CA 90001",SouthernCaliforniaCounty.LA_COUNTY, "3rd Shift");
        Driver driver5 = new Driver("Jessie", "9002 Red St, Fullertom, CA 92831",SouthernCaliforniaCounty.ORANGE_COUNTY, "2nd Shift");
        Driver driver6 = new Driver("Ruben", "1222 Hickleberry Rd, Whitter, CA 92312", SouthernCaliforniaCounty.LA_COUNTY, "1st Shift");
        Driver driver7 = new Driver("Nami", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, "3rd Shift");
        Driver driver8 = new Driver("Casper", "225 Booker Ave, Santa Ana, CA 92707",SouthernCaliforniaCounty.ORANGE_COUNTY, "2nd Shift");

        cpp.registerDriver(driverRachel);
        cpp.registerDriver(driverMac);
        cpp.registerDriver(driver3);
        cpp.registerDriver(driver4);
        cpp.registerDriver(driver5);
        cpp.registerDriver(driver6);
        cpp.registerDriver(driver7);
        cpp.registerDriver(driver8);

        //Place Orders
        cpp.placeOrder(john, res1, null, null);

    }   
    
}
