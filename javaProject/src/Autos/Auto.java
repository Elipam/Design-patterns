package Autos;

import Motor.Motor;
import Remsysteem.RemSysteem;

public abstract class Auto {
    public Motor motor;
    public RemSysteem RemSysteem;
    
    public String kleur;
    private int bouwjaar;
    private float price;

    public Auto() {
    }

    // Simplified constructor
    public Auto(Motor motor, RemSysteem RemSysteem, 
                String kleur, int bouwjaar, float gewicht, float price) {
        this.motor = motor;
        this.RemSysteem = RemSysteem;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
        this.price = price;
    }

    // Factory constructor
    public Auto(Motor motor, RemSysteem RemSysteem, String kleur, int bouwjaar) {
        this.motor = motor;
        this.RemSysteem = RemSysteem;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
    }

    public void start() {
        System.out.println("Auto starting");
    }

    public void stop() {
        System.out.println("Auto stopping");
    }

    public abstract float getPrijs();

    public void printInfo() {
        System.out.println(kleur + " auto");
    }

    public void printSuffer() {
        System.out.println(this.getClass() + "kleur:" + kleur + "-motor: " + motor.getMotorInfo() + "-RemSysteem:" + RemSysteem.getRemInfo());
    }
}
