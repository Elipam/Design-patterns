package Autos;

import Motor.*;
import Remsysteem.*;

public class PersonenAuto extends Auto {
    private static final float BASE_PRICE = 20000.00f;
    
    public PersonenAuto() {
        super(new DieselMotor(), new TrommelRemmen(), 
              "Zwart", 2024, BASE_PRICE);
    }

    public PersonenAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
    }

    @Override
    public void start() {
        System.out.println("Personenauto starten");
        super.start();
    }
    
    @Override
    public void stop() {
        System.out.println("Personenauto stoppen");
        super.stop();
    }

    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("Dit is een Personenauto");
        super.printInfo();
    }
}