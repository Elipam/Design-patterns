public abstract class Auto {
    protected Motor moter;
    protected RemSysteem remSystem;
    protected Tank tank;

    protected String kleur;
    private int bouwjaar;
    private float gewicht;
    private float price;

    public Auto() {
    }

    // Simplified constructor
    public Auto(/*Motor moter, RemSysteem remSystem, Tank tank,*/ 
                String kleur, int bouwjaar, float gewicht, float price) {
        /*this.moter = moter;
        this.remSystem = remSystem;
        this.tank = tank;*/
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
        this.gewicht = gewicht;
        this.price = price;
    }

    //factory constructor


    public Auto(Motor moter, RemSysteem remSystem, String kleur, int bouwjaar) {
        this.moter = moter;
        this.remSystem = remSystem;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
    }

    public void start() {
        // Simplified for now
        System.out.println("Auto starting");
        /*moter.startMotor(tank);*/
    }

    public void stop() {
        System.out.println("Auto stopping");
    }

    public abstract float getPrijs();

    public void printInfo() {
        System.out.println(kleur + " auto");
        /*System.out.println(kleur + tank.TankType + tank.getEnergieType() + remSystem.naam);*/
    }
    public void printSufferTank() {
        System.out.println(this.getClass() +"kleur:" + kleur + "-motor:" + moter.type + "-tank:" + tank.TankType + "-remSystem:" + remSystem.getRemInfo());

    }

    public void printSuffer() {

        System.out.println(this.getClass() + "kleur:" + kleur + "-motor: " + moter.type + "-remSystem:" + remSystem.getRemInfo());

    }

}

class SportAuto extends Auto {
    private static final float BASE_PRICE = 50000.00f;
    
    public SportAuto() {
        super(/*new Motor(), new RemSysteem(), new Tank(),*/ 
              "Rood", 2024, 1200.0f, BASE_PRICE);
    }

    public SportAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor,remsysteem,kleur,bouwjaar);
    }

    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("SportAuto: " + getPrijs());
    }
}

class PersonenAuto extends Auto {
    private static final float BASE_PRICE = 20000.00f;
    
    public PersonenAuto() {
        super(/*new Motor(), new RemSysteem(), new Tank(),*/ 
              "Zwart", 2024, 1500.0f, BASE_PRICE);
    }
    public PersonenAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor,remsysteem,kleur,bouwjaar);
    }

    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("PersonenAuto: " + getPrijs());
    }
}

class BestelBus extends Auto {
    private static final float BASE_PRICE = 35000.00f;
    
    public BestelBus() {
        super(/*new Motor(), new RemSysteem(), new Tank(),*/ 
              "Wit", 2024, 2500.0f, BASE_PRICE);
    }

    public BestelBus(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor,remsysteem,kleur,bouwjaar);
    }
    @Override
    public float getPrijs() {
        return BASE_PRICE;
    }

    @Override
    public void printInfo() {
        System.out.println("BestelBus: " + getPrijs());
    }
}

// class Aandrijver extends Auto {
//     public Aandrijver(Motor moter, Tank tank) {
//         super(moter, null, tank, "", 0, 0, 0);
//     }
// }
