import java.util.HashMap;

public class Dealership {
    private SportAutoFabriek sportAutoFabriek;
    private PersonenAutoFabriek personenAutoFabriek;
    private BestelBusAutoFabriek bestelBusAutoFabriek;
    private HashMap<Integer, String> presets = new HashMap<>();

    //fields

    public Dealership() {
    }

    public void getPresets() {
    }


    Auto verkrijgAuto(int fabriek, int aandrijving, int remSysteem, String choiceColor) {
        Auto result = null;

        AutoFabriek choiceFabriek = null; // 3 options
        AandrijvingSelectie choiceEnergy = null; //2 options
        RemSysteem choiceBrakes = null; //3 options

        switch (fabriek) {
            case 0:
                choiceFabriek = sportAutoFabriek;
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
