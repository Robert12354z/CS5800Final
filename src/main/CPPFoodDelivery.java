package main;

import java.util.ArrayList;
import java.util.List;
import Customer.Customer;
import Customer.Finalize;
import Establisments.Restaurant;
import driver.Driver;
import driver.SouthernCaliforniaCounty;
import Meal.Meal;
import Meal.Order;
import java.util.Date;
import Meal.Food;
import topping.Topping;



public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<Restaurant> restaurants;
    private List<Customer> customers;
    private List<Driver> drivers;

    public CPPFoodDelivery() {
        restaurants = new ArrayList<>();
        customers = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void registerRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    public Driver getAvailableDrivers(SouthernCaliforniaCounty southernCaliforniaCounty, Order order){
        for (Driver driver : drivers) {
            if (driver.isAvailable() && driver.getCounty().equals(southernCaliforniaCounty) && driver.orderedWithinDriversShift(order)) {
                driver.makeUnavailable();
                return driver;
            }
        }
        return null;
    }

    public void placeOrder(Customer customer, Restaurant restaurant, ArrayList<Food> meals, Date orderCreationTime) {
        if (restaurant.getOpeningTime().compareTo(orderCreationTime) > 0 || restaurant.getClosingTime().compareTo(orderCreationTime) < 0) {
            System.out.println("Ordered outside open hours");
            return;
        }

        Order order = new Order(customer, restaurant, meals, orderCreationTime);
        Driver availableDriver = getAvailableDrivers(restaurant.getCounty(), order);
        if (availableDriver == null) {
            System.out.println("No available drivers");
            return;
        }

        for(Food meal : meals){
            if(!restaurant.getMenu().contains(((Topping)meal).unwrap())){
                System.out.println("Meal not in menu");
                return;
            }
        }

        for(Food meal : meals){
            Finalize finalize = customer.finalizing(); //generating protein, carb, fat for meal

            ((Meal)(((Topping)meal).unwrap())).setCarb(finalize.getCarb());
            ((Meal)(((Topping)meal).unwrap())).setFat(finalize.getFat());
            ((Meal)(((Topping)meal).unwrap())).setProtein(finalize.getProtein());
        }

        order.registerObserver(availableDriver);
        order.notifyObservers();
        orderCreationTime.setMinutes(orderCreationTime.getMinutes() + 10);
        order.setOrderDeliveryTime(orderCreationTime);
        System.out.println(availableDriver + " has picked up " + order + " at " + order.getOrderDeliveryTime());
        System.out.println("Meal = " );
        for(Food meal : meals){
            System.out.println(((Meal)(((Topping)meal).unwrap())));
        }
    }
}
