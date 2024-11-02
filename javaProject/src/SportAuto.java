public class SportAuto extends Auto {
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
