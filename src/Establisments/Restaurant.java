package Establisments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import Meal.Meal;
import driver.SouthernCaliforniaCounty;

public class Restaurant {
    private String name; // e.g. Panda Express, In-N-Out, etc.
    private String address; // e.g. 1234 Main St, Irvine, CA 92618
    private SouthernCaliforniaCounty county; // e.g. Los Angeles, Orange County, etc.
    private Date openingTime; // e.g. 10:00 - 22:00
    private Date closingTime; // e.g. 10:00 - 22:00
    private String cuisine; // e.g. Chinese, Italian, etc.
    private ArrayList<Meal> menu;

    public Restaurant(String name, String address, SouthernCaliforniaCounty county, Date openingTime, Date closingTime, String cuisine, ArrayList<Meal> menu) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.cuisine = cuisine;
        this.menu = menu;
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

    public Date getOpeningTime() {
        return openingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public String getCuisine() {
        return cuisine;
    }

    public ArrayList<Meal> getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", county='" + county + '\'' +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", cuisine='" + cuisine + '\'' +
                '}';
    }

    




    
}
