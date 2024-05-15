package Customer;

public interface Fats {
    
    String getString();

}

class SourCream implements Fats {
    @Override
    public String getString() {
        return "Sour Cream";
    }
}

class Avocado implements Fats {
    @Override
    public String getString() {
        return "Avocado";
    }
}

class Tuna implements Fats {
    @Override
    public String getString() {
        return "Tuna";
    }
}

class Peanuts implements Fats {
    @Override
    public String getString() {
        return "Peanuts";
    }
}
