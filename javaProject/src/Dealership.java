import java.util.HashMap;

public class Dealership {
    protected SportAutoFabriek sportAutoFabriek;
    protected PersonenAutoFabriek personenAutoFabriek;
    protected BestelBusAutoFabriek bestelBusAutoFabriek;
    private HashMap<Integer, String> presets = new HashMap<>();

    //fields

    public Dealership() {

        int inputInt;
        String inputString;

        String a[] = {"Sport", "Personen", "BestelBus"};
        String b[] = {"Benzine", "Diesel", "Elektro"};
        String c[] = {"TrommelRemmen", "SchijfABSRemmen", "CarbonComposietRemmen"};


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {

                    inputInt = i * 100 + j * 10 + k;
                    inputString = a[i] + " " + b[j] + " auto met " + c[k];

                    presets.put(inputInt, inputString);

                }
            }
        }//fills preset hashmap

    }

    public Dealership(SportAutoFabriek sportAutoFabriek, PersonenAutoFabriek personenAutoFabriek,BestelBusAutoFabriek bestelBusAutoFabriek) {

        int inputInt;
        String inputString;

        String a[] = {"Sport", "Personen", "BestelBus"};
        String b[] = {"Benzine", "Diesel", "Elektro"};
        String c[] = {"TrommelRemmen", "SchijfABSRemmen", "CarbonComposietRemmen"};


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {

                    inputInt = i * 100 + j * 10 + k;
                    inputString = a[i] + " " + b[j] + " auto met " + c[k];

                    presets.put(inputInt, inputString);

                }
            }
        }//fills preset hashmap

    }


    public void getPresets() {
        for (int key : presets.keySet()) {
            System.out.println("key: " + key + " value: " + presets.get(key) );
        }
    }


    Auto verkrijgAuto(int fabriek, int aandrijving, int remSysteem, String choiceColor) {
        Auto result = null;

        AutoFabriek choiceFabriek = null; // 3 options
        AandrijvingSelectie choiceEnergy = null; //3 options
        RemSysteem choiceBrakes = null; //3 options

        switch (fabriek) {
            case 0:
                choiceFabriek = new SportAutoFabriek();
                break;
            case 1:
                choiceFabriek = personenAutoFabriek;
                break;
            case 2:
                choiceFabriek = bestelBusAutoFabriek;
                break;
        }

        switch (aandrijving) {
            case 0:
                choiceEnergy = new BenzineSelectie();
                break;

            case 1:
                choiceEnergy = new DieselSelectie();
                break;

            case 2:
                choiceEnergy = new ElektrischeSelectie();
                break;
        }

        switch (remSysteem) {
            case 0:
                choiceBrakes = new TrommelRemmen();
                break;

            case 1:
                choiceBrakes = new SchijfABSRemmen();
                break;

            case 2:
                choiceBrakes = new CarbonComposietRemmen();
                break;

        }

        result = choiceFabriek.MaakAuto();
        result.moter = choiceEnergy.leverMotor();
        result.tank = choiceEnergy.leverTank();
        result.remSystem = choiceBrakes;
        result.kleur = choiceColor;

        return result;
    }

}
