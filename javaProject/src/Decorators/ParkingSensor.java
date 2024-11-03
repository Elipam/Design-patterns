package Decorators;

import Autos.Auto;

public class ParkingSensor extends AutoDecorator {
    private static float ADDON_PRICE = 500.00f;

    // Constructor
    public ParkingSensor(Auto auto) {
        super(auto);
    }

    @Override
    public void start() {
        super.start(); 
        System.out.println("Parking sensors activated");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Parking sensors deactivated");
    }

    @Override
    public float getPrijs() {
        return super.getPrijs() + ADDON_PRICE;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- Parking sensors (" + ADDON_PRICE + ")");
    }
}
