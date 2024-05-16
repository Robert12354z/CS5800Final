package Meal;

import java.util.ArrayList;
import java.util.Date;

import Customer.Customer;
import Establisments.Restaurant;
import driver.Driver;



public class Order implements Subject{
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<Meal> meals;
    private Driver driver;
    private Date orderCreationTime;
    private Date orderDeliveryTime;
    private ArrayList<Observer> observers;
    private String shift;

    public Order(Customer customer, Restaurant restaurant, ArrayList<Meal> meals, Date orderCreationTime) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.meals = meals;
        
        this.orderCreationTime = orderCreationTime;
        this.observers = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getShift() {
        return shift;
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

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public Date getOrderDeliveryTime() {
        return orderDeliveryTime;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
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
