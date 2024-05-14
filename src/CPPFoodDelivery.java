import java.util.ArrayList;

public class CPPFoodDelivery {
    private List<Restaurant> restaurants;
    private List<Customer> customers;
    private List<Driver> drivers;

    public CPPFoodDelivery() {
        restaurants = new ArrayList<>();
        customers = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public void register(Object object) {
        if (object instanceof Restaurant) {
            restaurants.add((Driver) object);
        }
        if (object instanceof Customer) {
            customers.add((Customer) object);
        }
        if (object instanceof Driver) {
            drivers.add((Driver)object);
        }
    }
}
