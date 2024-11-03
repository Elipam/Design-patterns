package Decorators;

import Autos.Auto;

public class BoseSound extends AutoDecorator {
    private static float ADDON_PRICE = 1500.00f;

    public BoseSound(Auto auto) {
        super(auto);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Bose sound system online");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Bose sound system offline");
    }

    @Override
    public float getPrijs() {
        return super.getPrijs() + ADDON_PRICE;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- Bose Sound System (" + ADDON_PRICE + ")");
    }
}