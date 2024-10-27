import java.util.HashMap;

public class Dealership {
    private SportAutoFabriek sportAutoFabriek;
    private PersonenAutoFabriek PersonenAutoFabriek;
    private BestelBusAutoFabriek bestelBusAutoFabriek;
    private HashMap<Integer, String> presets = new HashMap<>();

    //fields

   public Dealership(){}
    public void getPresets(){}
    AbstracteAuto verkrijgAuto(int preset){
       AbstracteAuto result = new AbstracteAuto();
       return result;
    }

}
