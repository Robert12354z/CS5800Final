package Customer;

public interface Carbs {
    String getString();
    
}

class Cheese implements Carbs {
    @Override
    public String getString() {
        return "Cheese";
    }
}

class Bread implements Carbs {
    @Override
    public String getString() {
        return "Bread";
    }
}

class Lentils implements Carbs {
    @Override
    public String getString() {
        return "Lentils";
    }
}

class Pistachio implements Carbs {
    @Override
    public String getString() {
        return "Pistachio";
    }
}


