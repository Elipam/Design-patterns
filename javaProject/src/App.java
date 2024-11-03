import Decorators.*;
import Dealership.*;
import Autofabrieken.*;
import Autos.*;
import Motor.*;
import Remsysteem.*;

public class App {
    static boolean shout = true; //if true tests will print their output.

    public static void main(String[] args) {
        // Initaliase factories to demonstrate the factory pattern
        BestelBusAutoFabriek bestelBusAutoFabriek = new BestelBusAutoFabriek();
        PersonenAutoFabriek personenAutoFabriek = new PersonenAutoFabriek();
        SportAutoFabriek sportAutoFabriek = new SportAutoFabriek();

        Auto sportAuto = sportAutoFabriek.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "groen");
        Auto personenAuto = personenAutoFabriek.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "groen");

        sportAuto.printInfo();
        personenAuto.printInfo();
        
        System.out.println("\n===========================================\n");


        // Initaliase the dealership to demonstrate the facade pattern 
        Dealership dealership = new Dealership(sportAutoFabriek, personenAutoFabriek, bestelBusAutoFabriek);
        // get current dealership stock (or get orders with getOrderPresets())
        dealership.getStock();
        Auto verkregenauto = dealership.verkrijgAuto(3);
        verkregenauto.printInfo();

        System.out.println("\n===========================================\n");


        // Demonstrate the bridge pattern
        // Initialize a car with a diesel engine and start the car
        Auto demoAuto = new PersonenAuto(new DieselMotor(), new TrommelRemmen(), "Zwart", 2024);
        demoAuto.start();
        demoAuto.stop();

        // The bridge pattern can also be shown using brake function
        demoAuto.rem();

        System.out.println("\n===========================================\n");

        // Demonstrate the decorator pattern
        demoAuto = new BoseSound(demoAuto);
        demoAuto = new HeatedSeats(demoAuto);

        demoAuto.printInfo();
        System.out.println(demoAuto.getPrijs());

        // Decorators are also included in the start sequence
        demoAuto.start();

    }
}