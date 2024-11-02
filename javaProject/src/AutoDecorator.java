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
