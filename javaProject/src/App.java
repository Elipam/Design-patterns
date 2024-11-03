import Decorators.*;
import Dealership.*;
import Autofabrieken.*;
import Autos.*;
import Motor.*;
import Remsysteem.*;

public class App {
    static boolean shout = true; //if true tests will print their output.

    public static void main(String[] args) {

        BestelBusAutoFabriek bestelBusAutoFabriek = new BestelBusAutoFabriek();
        PersonenAutoFabriek personenAutoFabriek = new PersonenAutoFabriek();
        SportAutoFabriek sportAutoFabriek = new SportAutoFabriek();

        Dealership dealership = new Dealership(sportAutoFabriek, personenAutoFabriek, bestelBusAutoFabriek);
        dealership.getOrderPresets();
        dealership.getStock();
        Auto verkregenauto = dealership.verkrijgAuto(4);

        verkregenauto = new BoseSound(verkregenauto);
        verkregenauto = new HeatedSeats(verkregenauto);

        verkregenauto.start();
        verkregenauto.stop();
        verkregenauto.printInfo();
        System.out.println(verkregenauto.getPrijs());

    }
}

// class Test { //

//     static void newTests(String testID) {
//         System.out.println("\nNow testing\t:" + testID + "\n");

//         return;
//     }

//     static void exp(String expecting) {
//         System.out.println("Expecting\t:" + expecting);
//         return;
//     }

//     static void exp(int expecting) {
//         System.out.println("\nExpecting\t:" + expecting);
//         return;
//     }

//     static void res(String expecting) {
//         System.out.println("\tRecieved\t:" + expecting);
//         return;
//     }

//     static void res(int expecting) {
//         System.out.println("\tRecieved\t:" + expecting);
//         return;
//     }
//     static void res() {
//         System.out.print("\tRecieved\t:");
//         return;
//     }

//     static void exp(String expecting, String received) {
//         System.out.println("Expecting\t:" + expecting + "\t\t\treceived\t:" + received);
//         return;
//     }

//     static void exp(String expecting, int received) {
//         System.out.println("Expecting\t:" + expecting + "\t\t\treceived\t:" + received);
//         return;
//     }


//     static int testExample(boolean shout) { // returns amount of errors
//         int errors = 0;

//         //explain test here
//         // testing the testing functions, and making an example template.
//         if (shout) newTests("Example");

// //testing zone
//         //setup unit test, classes, instances, etc
//         String testThing;   //testing variables are important
//         testThing = Integer.toString(1) + Integer.toString(2) + Integer.toString(3);

//         //test condition of this unit
//         if (!testThing.equals("123")) errors++; // if my condition isn't true, increment errors
//         if (shout) exp("123", testThing);

//         //next unit

// //shout the amount of errors
//         if (shout) exp("errors", errors);

// //end of testing zone
//         return errors;
//     }//end of test

//     static int testBlank(boolean shout) { // returns amount of errors
//         int errors = 0;

//         //explain test here
//         // testing the testing functions, and making an example template.
//         if (shout) newTests("");

// //testing zone
//         //setup unit test, classes, instances, etc

//         //test condition of this unit

//         //next unit

// //shout the amount of errors
//         if (shout) exp("errors", errors);

// //end of testing zone
//         return errors;
//     }//end of test

//     public static void selectieTest() {//depricated
//         System.out.println("\n----------------------------------------");
//         System.out.println("begin selectietest");
//         System.out.println("----------------------------------------\n");
//         // AutoFabriek fabriek = new AandrijfTest();
//         for (int i = 0; i < 3; ++i) {
//             // fabriek.MaakAuto().start();
//         }
//         System.out.println("\n----------------------------------------");
//         System.out.println("einde selectietest");
//         System.out.println("----------------------------------------\n");
//     }

//     static int testDealershipPresets(boolean shout) { // returns amount of errors
//         int errors = 0;

//         //Testing the presets hashmap.
//         // testing the testing functions, and making an example template.
//         if (shout) newTests("DealerShip presets hashmap");

// //testing zone
//         //setup unit test, classes, instances, etc
//         Dealership dealership = new Dealership();
//         //test condition of this unit
//         dealership.getPresets();
//         //next unit

// //shout the amount of errors
//         if (shout) exp("errors", errors);

// //end of testing zone
//         return errors;
//     }//end of test

//     static int testDealershipOrdering(boolean shout) { // returns amount of errors
//         int errors = 0;

//         //Testing the presets hashmap.
//         // testing the testing functions, and making an example template.
//         if (shout) newTests("DealerShip ordering");

// //testing zone
//         //setup unit test, classes, instances, etc
//         SportAutoFabriek sportAutoFabriek;
//         sportAutoFabriek = new SportAutoFabriek();
//         PersonenAutoFabriek personenAutoFabriek;
//         personenAutoFabriek = new PersonenAutoFabriek();
//         BestelBusAutoFabriek bestelBusAutoFabriek;
//         bestelBusAutoFabriek = new BestelBusAutoFabriek();

//         Dealership dealership = new Dealership(sportAutoFabriek, personenAutoFabriek, bestelBusAutoFabriek);
//         //test condition of this unit
//         Auto auto0 = dealership.verkrijgAuto(0, ""); //sport benzine auto met trommol remmen, zonder kleur.
//         Auto auto1 = dealership.verkrijgAuto(1, 2, 1, "Geel");
//         Auto auto2 = dealership.verkrijgAuto(212, "Blauw met gele vlammen");

// //        exp("000\tsport benzine auto met trommol remmen, zonder kleur.");
// //        res();
// //      auto0.printSufferTank();

// //        exp("121:\tPersonen Elektro auto met schijfABS remmen, Geel.");
// //        res();
// //        auto1.printSufferTank();

// //        exp("212:\tBestelbus Diesel auto met Carbpon composietremmen, met gele vlammen over blauw.");
// //        res();
// //        auto2.printSufferTank();
//         //next unit

// //shout the amount of errors
//         if (shout) exp("errors", errors);

// //end of testing zone
//         return errors;
//     }//end of test

//     static void eliamTest() {
//         // Test decorator pattern
//         Auto auto = new SportAuto();
//         auto = new BoseSound(auto);
//         auto = new HeatedSeats(auto);
//         auto = new HeatedSeats(auto);

//         // Test functionality
//         auto.start();
//         auto.printInfo();
//         System.out.println("Total price: " + auto.getPrijs()); // Should be 52250 (50000 + 1500 + 750)
//         auto.stop();

//     }

//     static void factorytest() {
//         System.out.println("\n\nStart factory test");
//         AutoFabriek af = new SportAutoFabriek();
//         Auto a = af.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "groen");
//         System.out.println("SportAuto:");
//         a.printSuffer();

//         af = new PersonenAutoFabriek();
//         a = af.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "groen");
//         System.out.println("PersonenAuto:");
//         a.printSuffer();

//         af = new BestelBusAutoFabriek();
//         a = af.MaakAuto(new BenzineMotor(), new TrommelRemmen(), 2024, "groen");
//         System.out.println("BestelBus:");
//         a.printSuffer();
//     }
// }
