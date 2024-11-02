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
