abstract class AbstracteAuto {
    protected Motor moter;
    protected RemSysteem remSystem;

    private String kleur;
    private int bouwjaar;
    private float gewicht;  //kg     //float, that precision could be important. And some cars might be heavier then an int can express.
    private float price;    //float, some cars might cost more then int can express.

    //methods
    public AbstracteAuto() {
    }

    public void start() {
    }

    public void stop() {
    }

    public float getPrijs() {
        return 0;
    }

    public void printInfo() {
    }
}

class SportAuto extends AbstracteAuto {
}

class PersonenAuto extends AbstracteAuto {
}

class BestelBus extends AbstracteAuto {
}