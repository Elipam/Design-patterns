package Dealership;

import java.util.HashMap;

import Autofabrieken.*;
import Motor.*;
import Autos.*;
import Decorators.*;
import Remsysteem.*;

public class Dealership {
    protected SportAutoFabriek sportAutoFabriek;
    protected PersonenAutoFabriek personenAutoFabriek;
    protected BestelBusAutoFabriek bestelBusAutoFabriek;
    private HashMap<Integer, String> orderPresets = new HashMap<>();
    private HashMap<Integer, String> stockPresets = new HashMap<>();



    public Dealership(SportAutoFabriek sportAutoFabriek, PersonenAutoFabriek personenAutoFabriek, BestelBusAutoFabriek bestelBusAutoFabriek) {

        this.sportAutoFabriek = sportAutoFabriek;
        this.personenAutoFabriek = personenAutoFabriek;
        this.bestelBusAutoFabriek = bestelBusAutoFabriek;

        int inputInt;
        String inputString;

        String a[] = {"Sport", "Personen", "BestelBus"};
        String b[] = {"Benzine", "Diesel", "Elektro"};
        String c[] = {"TrommelRemmen", "SchijfABSRemmen", "CarbonComposietRemmen"};

        // Fill stock preset hashmap
        stockPresets.put(1, "Rode personenauto met een benzinemotor en trommelremmen");
        stockPresets.put(2, "Zwarte personenauto met een dieselmotor en schijfremmen");
        stockPresets.put(3, "Witte bestelbus met een elektromotor en schijfremmen");
        stockPresets.put(4, "Rode sportauto met een benzinemotor, carbonremmen en een bose geluidsinstallatie");


        // Fill orderpreset hashmapm with all possibilities
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {

                    inputInt = i * 100 + j * 10 + k;
                    inputString = a[i] + " " + b[j] + " auto met " + c[k];

                    orderPresets.put(inputInt, inputString);

                }
            }
        }


    }

    public void getStock() {
        System.out.println("cars currently in stock:");
        for (int key : stockPresets.keySet()) {
            System.out.println("StockID: " + key + " auto: " + stockPresets.get(key));
        }
    }

    public void getOrderPresets() {
        System.out.println("cars available for order:");
        for (int key : orderPresets.keySet()) {
            System.out.println("OrderID: " + key + " auto: " + orderPresets.get(key));
        }
    }


    public Auto orderAuto(int fabriek, int motor, int remSysteem, String choiceColor) {
        Auto result = null;

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

    public Auto orderAuto(int choice, String choiceColor) {
        Auto result = null;

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

    public Auto verkrijgAuto(int stockID) {
        Auto result = null;

        switch (stockID) {
            case 1:
                result = personenAutoFabriek.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "Rood");
                break;
            case 2:
                result = personenAutoFabriek.MaakAuto(new DieselMotor(), new SchijfABSRemmen(), 2024, "Zwart");
                break;
            case 3:
                result = bestelBusAutoFabriek.MaakAuto(new ElektroMotor(), new SchijfABSRemmen(), 2022, "Wit");
                break;
            case 4:
                result = sportAutoFabriek.MaakAuto(new BenzineMotor(), new CarbonCompositeRemmen(), 2024, "Rood"); 
                result = new BoseSound(result);
                break;
        }

        return result;
    }

}
