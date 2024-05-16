package driver;

import meal.Observer;
import meal.Order;

public class Driver implements Observer{
    private String name;
    private String address;
    private SouthernCaliforniaCounty county;
    private String shift;

    public Driver(String name, String address, SouthernCaliforniaCounty county, String shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
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

    public String getShift() {
        return shift;
    }

    @Override
    public void update(Order order) {
        if (order.getRestaurant().getCounty().equals(county.toString()) && order.getShift().equals(shift)) {
            System.out.println("Driver " + name + " has received the order from " + order.getCustomer().getName());
        }
    }

}
