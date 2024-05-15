package Customer;

import java.util.ArrayList;
import java.util.Random;


public interface MacroFactory {

    Carbs createCarbs();
    Protein createProteins();
    Fats createFats();
}

class NoRestriction implements MacroFactory{

    private static final Random random = new Random();

    private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
    static{
        allCarbs.add(new Cheese());
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());
        allCarbs.add(new Pistachio());
    }

    int randomIndex = random.nextInt(allCarbs.size());

    private static final ArrayList<Protein> allProteins = new ArrayList<>();
    static{
        allProteins.add(new Chicken());
        allProteins.add(new Beef());
        allProteins.add(new Fish());
        allProteins.add(new Tofu());
    }

    private static final ArrayList<Fats> allFats = new ArrayList<>();
    static{
        allFats.add(new SourCream());
        allFats.add(new Avocado());
        allFats.add(new Peanuts());
        allFats.add(new Tuna());
    }

    @Override
    public Carbs createCarbs() {
        return allCarbs.get(randomIndex);
    }

    @Override
    public Protein createProteins() {
        return allProteins.get(randomIndex);
    }

    @Override
    public Fats createFats() {
        return allFats.get(randomIndex);
    }
    
}

class Paleo implements MacroFactory{

    private static final Random random = new Random();

    private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
    static{
        allCarbs.add(new Pistachio());
    }

    int randomIndex = random.nextInt(allCarbs.size());

    private static final ArrayList<Protein> allProteins = new ArrayList<>();
    static{
        allProteins.add(new Chicken());
        allProteins.add(new Beef());
        allProteins.add(new Fish());
    }

    private static final ArrayList<Fats> allFats = new ArrayList<>();
    static{
        allFats.add(new Avocado());
        allFats.add(new Peanuts());
        allFats.add(new Tuna());
    }

    @Override
    public Carbs createCarbs() {
        return allCarbs.get(random.nextInt(allCarbs.size()));
    }

    @Override
    public Protein createProteins() {
        return allProteins.get(random.nextInt(allProteins.size()));
    }

    @Override
    public Fats createFats() {
        return allFats.get(random.nextInt(allFats.size()));
    }

}   

class Vegan implements MacroFactory{

    private static final Random random = new Random();

    private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
    static{
        allCarbs.add(new Lentils());
        allCarbs.add(new Pistachio());
        allCarbs.add(new Bread());
    }

    int randomIndex = random.nextInt(allCarbs.size());

    private static final ArrayList<Protein> allProteins = new ArrayList<>();
    static{
        allProteins.add(new Tofu());
    }

    private static final ArrayList<Fats> allFats = new ArrayList<>();
    static{
        allFats.add(new Avocado());
        allFats.add(new Peanuts());
    }

    @Override
    public Carbs createCarbs() {
        return allCarbs.get(random.nextInt(allCarbs.size()));
    }

    @Override
    public Protein createProteins() {
        return allProteins.get(random.nextInt(allProteins.size()));
    }

    @Override
    public Fats createFats() {
        return allFats.get(random.nextInt(allFats.size()));
    }

    class NutAllergy implements MacroFactory{
         private static final Random random = new Random();

    private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
    static{
        allCarbs.add(new Cheese());
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());
    }

    int randomIndex = random.nextInt(allCarbs.size());

    private static final ArrayList<Protein> allProteins = new ArrayList<>();
    static{
        allProteins.add(new Chicken());
        allProteins.add(new Beef());
        allProteins.add(new Fish());
        allProteins.add(new Tofu());
    }

    private static final ArrayList<Fats> allFats = new ArrayList<>();
    static{
        allFats.add(new SourCream());
        allFats.add(new Avocado());
        allFats.add(new Tuna());
    }

    @Override
    public Carbs createCarbs() {
        return allCarbs.get(random.nextInt(allCarbs.size()));
    }

    @Override
    public Protein createProteins() {
        return allProteins.get(random.nextInt(allProteins.size()));
    }

    @Override
    public Fats createFats() {
        return allFats.get(random.nextInt(allFats.size()));
    }
    }




}

class NutAll implements MacroFactory{

    private static final Random random = new Random();

    private static final ArrayList<Carbs> allCarbs = new ArrayList<>();
    static{
        allCarbs.add(new Cheese());
        allCarbs.add(new Bread());
        allCarbs.add(new Lentils());
    }

    int randomIndex = random.nextInt(allCarbs.size());

    private static final ArrayList<Protein> allProteins = new ArrayList<>();
    static{
        allProteins.add(new Chicken());
        allProteins.add(new Beef());
        allProteins.add(new Fish());
        allProteins.add(new Tofu());
    }

    private static final ArrayList<Fats> allFats = new ArrayList<>();
    static{
        allFats.add(new SourCream());
        allFats.add(new Avocado());
        allFats.add(new Tuna());
    }

    @Override
    public Carbs createCarbs() {
        return allCarbs.get(random.nextInt(allCarbs.size()));
    }

    @Override
    public Protein createProteins() {
        return allProteins.get(random.nextInt(allProteins.size()));
    }

    @Override
    public Fats createFats() {
        return allFats.get(random.nextInt(allFats.size()));
    }

}

