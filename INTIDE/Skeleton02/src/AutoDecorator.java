public abstract class AutoDecorator {
    protected AbstracteAuto auto;

    public AutoDecorator(AbstracteAuto auto) {

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


    public ParkingSensor(AbstracteAuto auto) {
    }

    public void start() {
    }

    public void stop() {
    }

}