public class BestelBus extends Auto {
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
