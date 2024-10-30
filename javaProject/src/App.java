import java.util.*;

public class App {
    static boolean shout = true; //if true tests will print their output.

    public static void main(String[] args) {
        // System.out.println("hiiii");
        // Test.testExample(shout);
        // Test.selectieTest();
        // Test.testDealershipPresets(shout);
        // Test.testDealershipOrdering(shout);

        // Test decorator pattern
        Auto auto = new SportAuto();
        auto = new BoseSound(auto);
        auto = new HeatedSeats(auto);
        auto = new HeatedSeats(auto);

        // Test functionality
        auto.start();
        auto.printInfo();
        System.out.println("Total price: " + auto.getPrijs()); // Should be 52250 (50000 + 1500 + 750)
        auto.stop();
    }
}

class Test { //

    static void newTests(String testID) {
        System.out.println("\nNow testing\t:" + testID + "\n");

        return;
    }

    static void exp(String expecting) {
        System.out.println("Expecting\t:" + expecting);
        return;
    }

    static void exp(int expecting) {
        System.out.println("Expecting\t:" + expecting);
        return;
    }

    static void res(String expecting) {
        System.out.println("\tRecieved\t:" + expecting);
        return;
    }

    static void res(int expecting) {
        System.out.println("\tRecieved\t:" + expecting);
        return;
    }

    static void exp(String expecting, String received) {
        System.out.println("Expecting\t:" + expecting + "\t\t\treceived\t:" + received);
        return;
    }

    static void exp(String expecting, int received) {
        System.out.println("Expecting\t:" + expecting + "\t\t\treceived\t:" + received);
        return;
    }


    static int testExample(boolean shout) { // returns amount of errors
        int errors = 0;

        //explain test here
        // testing the testing functions, and making an example template.
        if (shout) newTests("Example");

//testing zone
        //setup unit test, classes, instances, etc
        String testThing;   //testing variables are important
        testThing = Integer.toString(1) + Integer.toString(2) + Integer.toString(3);

        //test condition of this unit
        if (!testThing.equals("123")) errors++; // if my condition isn't true, increment errors
        if (shout) exp("123", testThing);

        //next unit

//shout the amount of errors
        if (shout) exp("errors", errors);

//end of testing zone
        return errors;
    }//end of test

    static int testBlank(boolean shout) { // returns amount of errors
        int errors = 0;

        //explain test here
        // testing the testing functions, and making an example template.
        if (shout) newTests("");

//testing zone
        //setup unit test, classes, instances, etc

        //test condition of this unit

        //next unit

//shout the amount of errors
        if (shout) exp("errors", errors);

//end of testing zone
        return errors;
    }//end of test

    public static void selectieTest() {
        System.out.println("\n----------------------------------------");
        System.out.println("begin selectietest");
        System.out.println("----------------------------------------\n");
        // AutoFabriek fabriek = new AandrijfTest();
        for (int i = 0; i < 3; ++i) {
            // fabriek.MaakAuto().start();
        }
        System.out.println("\n----------------------------------------");
        System.out.println("einde selectietest");
        System.out.println("----------------------------------------\n");
    }

    static int testDealershipPresets(boolean shout) { // returns amount of errors
        int errors = 0;

        //Testing the presets hashmap.
        // testing the testing functions, and making an example template.
        if (shout) newTests("DealerShip presets hashmap");

//testing zone
        //setup unit test, classes, instances, etc
        Dealership dealership = new Dealership();
        //test condition of this unit
        dealership.getPresets();
        //next unit

//shout the amount of errors
        if (shout) exp("errors", errors);

//end of testing zone
        return errors;
    }//end of test

    static int testDealershipOrdering(boolean shout) { // returns amount of errors
        int errors = 0;

        //Testing the presets hashmap.
        // testing the testing functions, and making an example template.
        if (shout) newTests("DealerShip presets hashmap");

//testing zone
        //setup unit test, classes, instances, etc
        SportAutoFabriek sportAutoFabriek = new SportAutoFabriek();
        PersonenAutoFabriek personenAutoFabriek = new PersonenAutoFabriek();
        BestelBusAutoFabriek bestelBusAutoFabriek = new BestelBusAutoFabriek();

        Dealership dealership = new Dealership(sportAutoFabriek, personenAutoFabriek, bestelBusAutoFabriek);
        //test condition of this unit
        Auto auto0 = dealership.verkrijgAuto(0, 0, 0, ""); //sport benzine auto met trommol remmen, zonder kleur.

        auto0.printInfo();
        //next unit

//shout the amount of errors
        if (shout) exp("errors", errors);

//end of testing zone
        return errors;
    }//end of test

}
