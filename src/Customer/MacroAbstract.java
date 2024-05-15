package Customer;

public class MacroAbstract {

    private static MacroAbstract instance;
    
    private final MacroFactory noRestriction;
    private final MacroFactory paleo;
    private final MacroFactory vegan;
    private final MacroFactory nutAll;

    public MacroAbstract() {
        this.noRestriction = new NoRestriction();
        this.paleo = new Paleo();
        this.vegan = new Vegan();
        this.nutAll = new NutAll();
    }

    public static MacroAbstract getInstance(){
        if (instance == null){
            instance = new MacroAbstract();
        }
        return instance;
    }

    public MacroFactory getFactory(DietPlan dietPlan){
        switch (dietPlan){
            case NORESTRICTION:
                return noRestriction;
            case PALEO:
                return paleo;
            case VEGAN:
                return vegan;
            case NUTALL:
                return nutAll;
            default:
                return null;
        }
    }


}
