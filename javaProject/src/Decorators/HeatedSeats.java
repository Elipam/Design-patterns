package Decorators;

import Autos.Auto;

public class HeatedSeats extends AutoDecorator {

    private static final float ADDON_PRICE = 750.00f;

    public HeatedSeats(Auto auto) {
        super(auto);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Heated seats warming up");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Heated seats turned off");
    }

    @Override
    public float getPrijs() {
        return super.getPrijs() + ADDON_PRICE;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- Heated Seats (" + ADDON_PRICE + ")");
    }
}