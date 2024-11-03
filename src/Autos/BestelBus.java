package Autos;

import Motor.*;
import Remsysteem.*;

public class BestelBus extends Auto {
    private static final float BASE_PRICE = 35000.00f;
    
    public BestelBus() {
        super(new ElektroMotor(), new CarbonCompositeRemmen(), 
              "Wit", 2024, BASE_PRICE);
    }

    public BestelBus(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
    }

    @Override
    public void start() {
        System.out.println("BestelBus starten");
        super.start();
    }
    
    @Override
    public void stop() {
        System.out.println("BestelBus stoppen");
        super.stop();
    }

    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("Dit is een bestelbus");
        super.printInfo();
    }
}