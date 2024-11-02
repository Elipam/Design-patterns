public class PersonenAuto extends Auto {
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
