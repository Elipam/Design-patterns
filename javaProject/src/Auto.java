public abstract class Auto {
    protected Motor motor;
    protected RemSysteem RemSysteem;
    
    protected String kleur;
    private int bouwjaar;
    private float gewicht;
    private float price;

    public Auto() {
    }

    // Simplified constructor
    public Auto(Motor motor, RemSysteem RemSysteem, 
                String kleur, int bouwjaar, float gewicht, float price) {
        this.motor = motor;
        this.RemSysteem = RemSysteem;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
        this.gewicht = gewicht;
        this.price = price;
    }

    // Factory constructor
    public Auto(Motor motor, RemSysteem RemSysteem, String kleur, int bouwjaar) {
        this.motor = motor;
        this.RemSysteem = RemSysteem;
        this.kleur = kleur;
        this.bouwjaar = bouwjaar;
    }

    public void start() {
        System.out.println("Auto starting");
    }

    public void stop() {
        System.out.println("Auto stopping");
    }

    public abstract float getPrijs();

    public void printInfo() {
        System.out.println(kleur + " auto");
    }

    public void printSuffer() {
        System.out.println(this.getClass() + "kleur:" + kleur + "-motor: " + motor.getMotorInfo() + "-RemSysteem:" + RemSysteem.getRemInfo());
    }
}

class SportAuto extends Auto {
    private static final float BASE_PRICE = 50000.00f;
    
    public SportAuto() {
        super(new BenzineMotor(), new SchijfABSRemmen(), 
              "Rood", 2024, 1200.0f, BASE_PRICE);
    }

    public SportAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
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
        super(new DieselMotor(), new TrommelRemmen(), 
              "Zwart", 2024, 1500.0f, BASE_PRICE);
    }

    public PersonenAuto(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
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
        super(new ElektroMotor(), new CarbonCompositeRemmen(), 
              "Wit", 2024, 2500.0f, BASE_PRICE);
    }

    public BestelBus(Motor motor, RemSysteem remsysteem, String kleur, int bouwjaar) {
        super(motor, remsysteem, kleur, bouwjaar);
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
