public abstract class AutoDecorator extends Auto {
    protected Auto auto;

    public AutoDecorator(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void start() {
        auto.start();
    }

    @Override
    public void stop() {
        auto.stop();
    }

    @Override
    public float getPrijs() {
        return auto.getPrijs();
    }

    @Override
    public void printInfo() {
        auto.printInfo();
    }
}
class ParkingSensor extends AutoDecorator {
    private static final float ADDON_PRICE = 500.00f;


    public ParkingSensor(Auto auto) {
        super(auto);  // Roep constructor van parent
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