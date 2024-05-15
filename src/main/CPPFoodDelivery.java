package main;

import java.util.ArrayList;
import java.util.List;
import Customer.Customer;
import Establisments.Restaurant;
import driver.Driver;
import driver.SouthernCaliforniaCounty;
import meal.Meal;
import meal.Order;
import java.util.Date;



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

    public List<Driver> getAvaliableDrivers(SouthernCaliforniaCounty southernCaliforniaCounty, String shift){
        List<Driver> avaliableDrivers = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getCounty().equals(southernCaliforniaCounty) && driver.getShift().equals(shift)) {
                avaliableDrivers.add(driver);
            }
        }
        return avaliableDrivers;
    }

    public void placeOrder(Customer customer, Restaurant restaurant, ArrayList<Meal> meals, Date orderCreationTime) {
        Order order = new Order(customer, restaurant, meals, orderCreationTime);
        List<Driver> avaliableDrivers = getAvaliableDrivers(restaurant.getCounty(), "3rd Shift");
        for(Driver driver : avaliableDrivers) {
            order.registerObserver(driver);
        }


    }
}
