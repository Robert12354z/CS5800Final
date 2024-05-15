package Customer;

public interface Protein {
    
    String getString();

}

class Chicken implements Protein {
    @Override
    public String getString() {
        return "Chicken";
    }
}

class Beef implements Protein {
    @Override
    public String getString() {
        return "Beef";
    }
}

class Fish implements Protein {
    @Override
    public String getString() {
        return "Fish";
    }
}

class Tofu implements Protein {
    @Override
    public String getString() {
        return "Tofu";
    }
}
