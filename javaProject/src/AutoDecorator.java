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
        return super.getPrijs() + 500;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("+ Parking sensors (€500)");
    }
}

class BosseSound extends AutoDecorator {
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
        return super.getPrijs() + 1500;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("+ Bosse Sound System (€1500)");
    }
}

class HeatedSeats extends AutoDecorator {

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
        return super.getPrijs() + 750;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("+ Heated Seats (€750)");
    }
}