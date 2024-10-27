public abstract class AutoDecorator {
    protected Auto auto;

    public AutoDecorator(Auto auto) {

    }

    public AutoDecorator() {

    }

    abstract public void start();

    abstract public void stop();

    public int getPrijs() {
        return 0;
    }

    public void printinfo() {
    }
}

class ParkingSensor extends AutoDecorator {


    public ParkingSensor(Auto auto) {
    }

    public void start() {
    }

    public void stop() {
    }

}

class BosseSound extends AutoDecorator {


    public BosseSound(Auto auto) {
    }

    public void start() {
    }

    public void stop() {
    }

}

class HeatedSeats extends AutoDecorator {


    public HeatedSeats(Auto auto) {
    }

    public void start() {
    }

    public void stop() {
    }

}