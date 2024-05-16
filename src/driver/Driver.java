package driver;

import Meal.Observer;
import Meal.Order;

public class Driver implements Observer {
    private final String name;
    private final String address;
    private final SouthernCaliforniaCounty county;
    private final TimeShifts shift;
    private boolean available;

    public Driver(String name, String address, SouthernCaliforniaCounty county, TimeShifts shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
        available = true;
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
        if (shift.equals(TimeShifts.FIRST)) {
            return "8AM-4PM";
        } else if (shift.equals(TimeShifts.SECOND)) {
            return "4PM-12AM";
        } else {
            return "12AM-8AM";
        }
    }

    public void makeUnavailable() {
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public void update(Order order) {
        if (order.getRestaurant().getCounty().equals(county.toString()) && orderedWithinDriversShift(order)) {
            System.out.println("Driver " + name + " has received the order from " + order.getCustomer().getName());
        }
    }

    public boolean orderedWithinDriversShift(Order order) {
        if (shift.equals(TimeShifts.FIRST)) {
            return order.getOrderCreationTime().getHours() >= 8 && order.getOrderCreationTime().getHours() < 16;
        } else if (shift.equals(TimeShifts.SECOND)) {
            return order.getOrderCreationTime().getHours() >= 16;
        } else {
            return order.getOrderCreationTime().getHours() < 8;
        }
    }

}
