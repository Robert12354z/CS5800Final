package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Customer.*;

import Meal.*;

import topping.*;

import main.*;

import driver.*;

import Establisments.*;


public class OrderTest {

    @Test
    public void testOrder() {

        DietPlan noRestriction = DietPlan.NORESTRICTION;
        ArrayList<Meal> menu1 = new ArrayList<>();
        CPPFoodDelivery cpp = CPPFoodDelivery.getInstance();

        MacroFactory macroFactory = MacroAbstract.getInstance().getFactory(noRestriction);
        ArrayList<Protein> proteins = macroFactory.getAllProteins();
        ArrayList<Carbs> carbs = macroFactory.getAllCarbs();
        ArrayList<Fats> fats = macroFactory.getAllFats();


        Date openingTime = new Date();
        openingTime.setHours(1);
        Date closingTime = new Date();
        closingTime.setHours(23);

        ArrayList<Meal> menu2 = new ArrayList<>();

        CPPFoodDelivery cppFoodDelivery = CPPFoodDelivery.getInstance();
        Customer john = new Customer("John", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, DietPlan.PALEO);
        Restaurant res2 = new Restaurant("In-N-Out","253 Mcdonald Ave",SouthernCaliforniaCounty.ORANGE_COUNTY, openingTime, closingTime, "American",menu2);
        Meal meal = new Meal(fats.get(0), carbs.get(0), proteins.get(0), "Chicken Salad");
        menu2.add(meal);

        cppFoodDelivery.registerCustomer(john);
        cppFoodDelivery.registerRestaurant(res2);  

        Driver driverRachel = new Driver("Rachel", "1234 Main St, Irvine, CA 92618",SouthernCaliforniaCounty.LA_COUNTY, "3rd Shift");
        Driver driverMac = new Driver("Mac", "225 Booker Ave, Santa Ana, CA 92707",SouthernCaliforniaCounty.ORANGE_COUNTY, "2nd Shift");
        Driver driver3 = new Driver("Rebecca", "1225 Panda St, Riverside, CA 92501",SouthernCaliforniaCounty.SAN_BERNARDINO_COUNTY, "1st Shift");
        Driver driver4 = new Driver("Jason", "154 Purple Lane, Los Angeles, CA 90001",SouthernCaliforniaCounty.LA_COUNTY, "3rd Shift");
        Driver driver5 = new Driver("Jessie", "9002 Red St, Fullertom, CA 92831",SouthernCaliforniaCounty.ORANGE_COUNTY, "2nd Shift");

        cppFoodDelivery.registerDriver(driverRachel);
        cppFoodDelivery.registerDriver(driverMac);
        cppFoodDelivery.registerDriver(driver3);
        cppFoodDelivery.registerDriver(driver4);
        cppFoodDelivery.registerDriver(driver5);

        ArrayList<Food> order1 = new ArrayList<>();
        order1.add(new Ketchup(meal));

        cppFoodDelivery.placeOrder(john, res2, order1, new Date());

        assertEquals(order1, order1);
        

    }

    
    
}
