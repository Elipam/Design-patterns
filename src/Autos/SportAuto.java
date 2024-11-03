package Autos;

import Motor.*;
import Remsysteem.*;

public class SportAuto extends Auto {
    private static final float BASE_PRICE = 50000.00f;
    
    public SportAuto() {
        super(new BenzineMotor(), new SchijfABSRemmen(), 
              "Rood", 2024, BASE_PRICE);
    }

    public SportAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
    }

    @Override
    public void start() {
        System.out.println("Sportauto starten");
        super.start();
    }
    
    @Override
    public void stop() {
        System.out.println("Sportauto stoppen");
        super.stop();
    }

    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("Dit is een Sportauto");
        super.printInfo();
    }
}