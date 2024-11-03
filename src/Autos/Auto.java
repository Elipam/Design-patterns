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
        this.motor = null;
        this.RemSysteem = null;
        this.kleur = null;
        this.bouwjaar = 0;
        this.price = 0;
    }

    // Simplified constructor
    public Auto(Motor motor, RemSysteem RemSysteem, 
                String kleur, int bouwjaar, float price) {
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
        this.motor.startMotor();
    }

    public void stop() {
        this.motor.stopMotor();
    }

    public void rem() {
        this.RemSysteem.rem();
    }

    public float getPrijs() {
        return price;
    }

    public void printInfo() {
        System.out.println("kleur: " + kleur + "\nmotor: " + motor.getMotorInfo() + "\nRemSysteem: " + RemSysteem.getRemInfo() + "\nbouwjaar: " + bouwjaar);
    }
}
