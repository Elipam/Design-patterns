// Description: This file contains the AutoDecorator class and its subclasses
// The AutoDecorator class is an abstract class that extends the Auto class, and is used to add additional features to an Auto object
// The AutoDecorator class adds features via the subclasses ParkingSensor, BosseSound, and HeatedSeats
// The purpose of the Decorator pattern is to add functionality to an object dynamically, without affecting the behavior of other objects
public abstract class AutoDecorator extends Auto {
    protected Auto auto;

    // Constructor
    public AutoDecorator(Auto auto) {
        this.auto = auto;
    }

    // Start the car
    @Override
    public void start() {
        auto.start();
    }

    // Stop the car
    @Override
    public void stop() {
        auto.stop();
    }

    // Get the price of the car
    @Override
    public float getPrijs() {
        return auto.getPrijs();
    }

    // Print the information of the car
    @Override
    public void printInfo() {
        auto.printInfo();
    }
}
class ParkingSensor extends AutoDecorator {
    private static final float ADDON_PRICE = 500.00f;

    // Constructor
    public ParkingSensor(Auto auto) {
        super(auto);
    }

    @Override
    public void start() {
        super.start();  // Roep methode van parent
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

class BosseSound extends AutoDecorator {
    private static final float ADDON_PRICE = 1500.00f;

    public BosseSound(Auto auto) {
        super(auto);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Bosse sound system online");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Bosse sound system offline");
    }

    @Override
    public float getPrijs() {
        return super.getPrijs() + ADDON_PRICE;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("- Bosse Sound System (" + ADDON_PRICE + ")");
    }
}

class HeatedSeats extends AutoDecorator {

    private static final float ADDON_PRICE = 750.00f;

    public HeatedSeats(Auto auto) {
        super(auto);  // Call parent constructor
    }

    @Override
    public void start() {
        super.start();  // Call parent method
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