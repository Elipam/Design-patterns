public abstract class Auto {
    protected Motor moter;
    protected RemSysteem remSystem;

    protected Tank tank;

    protected String kleur;
    private int bouwjaar;
    private float gewicht;  //kg     //float, that precision could be important. And some cars might be heavier then an int can express.
    private float price;    //float, some cars might cost more then int can express.

    //methods
    public Auto() {
    }

    public Auto(Motor moter, RemSysteem remSystem, Tank tank, String kleur, int bouwjaar, float gewicht, float price) {
        this.moter = moter;
        this.remSystem = remSystem;
        this.tank = tank;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
        this.gewicht = gewicht;
        this.price = price;
    }

    public void start() {
        moter.startMotor(tank);
    }

    public void stop() {
    }

    public float getPrijs() {
        return 0;
    }

    public void printInfo() {
        System.out.println(kleur + tank.TankType + tank.getEnergieType() + remSystem.naam);
    }
}

class SportAuto extends Auto {
}

class PersonenAuto extends Auto {
}

class BestelBus extends Auto {
}

class Aandrijver extends Auto {
    public Aandrijver(Motor moter, Tank tank) {
        super(moter, null, tank, "", 0, 0, 0);
    }
}
