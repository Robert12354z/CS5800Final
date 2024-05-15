package meal;

import java.util.ArrayList;

import Customer.Customer;
import Establisments.Restaurant;
import driver.Driver;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<Meal> meals;
    private Driver driver;

    public Order(Customer customer, Restaurant restaurant, ArrayList<Meal> meals, Driver driver) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.meals = meals;
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public Driver getDriver() {
        return driver;
    }

    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", restaurant=" + restaurant +
                ", meals=" + meals +
                ", driver=" + driver +
                '}';
    }
    
}
