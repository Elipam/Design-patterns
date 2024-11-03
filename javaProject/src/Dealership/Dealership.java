package Dealership;

import java.util.HashMap;

import Autofabrieken.*;
import Motor.*;
import Autos.*;
import Remsysteem.*;

public class Dealership {
    /*TODO Currently VerkrijgAuto generates a car with null instances for its parts. */
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

    public Dealership(SportAutoFabriek sportAutoFabriek, PersonenAutoFabriek personenAutoFabriek, BestelBusAutoFabriek bestelBusAutoFabriek) {

        this.sportAutoFabriek = sportAutoFabriek;
        this.personenAutoFabriek = personenAutoFabriek;
        this.bestelBusAutoFabriek = bestelBusAutoFabriek;

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
            System.out.println("key: " + key + " value: " + presets.get(key));
        }
    }


    public Auto verkrijgAuto(int fabriek, int motor, int remSysteem, String choiceColor) {
        Auto result = null;

        AutoFabriek choiceFabriek = null; // 3 options
        Motor choiceMotor = null;
        RemSysteem choiceBrakes = null; //3 options

        switch (fabriek) {
            case 0:
                result = sportAutoFabriek.MaakAuto();
                break;
            case 1:
                result = personenAutoFabriek.MaakAuto();
                break;
            case 2:
                result = bestelBusAutoFabriek.MaakAuto();
                break;
        }

        switch (motor) {
            case 0:
                choiceMotor = new BenzineMotor();
                break;

            case 1:
                choiceMotor = new DieselMotor();
                break;

            case 2:
                choiceMotor = new ElektroMotor();
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
                choiceBrakes = new CarbonCompositeRemmen();
                break;

        }

        result.motor = choiceMotor;
        result.RemSysteem = choiceBrakes;
        result.kleur = choiceColor;

        return result;
    }

    public Auto verkrijgAuto(int choice, String choiceColor) {
        Auto result = null;

        AutoFabriek choiceFabriek = null; // 3 options
        Motor choiceMotor = null;
        RemSysteem choiceBrakes = null; //3 options

        switch ((choice/1)%10) {
            case 10:
            case 0:
                result = sportAutoFabriek.MaakAuto();
                break;
            case 1:
                result = personenAutoFabriek.MaakAuto();
                break;
            case 2:
                result = bestelBusAutoFabriek.MaakAuto();
                break;
        }

        switch ((choice/10)%10) {
            case 0:
                choiceMotor = new BenzineMotor();
                break;

            case 1:
                choiceMotor = new DieselMotor();
                break;

            case 2:
                choiceMotor = new ElektroMotor();
                break;

        }

        switch ((choice/100)%10) {
            case 0:
                choiceBrakes = new TrommelRemmen();
                break;

            case 1:
                choiceBrakes = new SchijfABSRemmen();
                break;

            case 2:
                choiceBrakes = new CarbonCompositeRemmen();
                break;

        }

        result.motor = choiceMotor;
        result.RemSysteem = choiceBrakes;
        result.kleur = choiceColor;

        return result;
    }

}
