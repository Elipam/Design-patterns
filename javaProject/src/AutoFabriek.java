abstract public class AutoFabriek {
    public AutoFabriek() {
    }


   public abstract Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur);

}

class SportAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
        return new SportAuto(motor,remsysteem,kleur,bouwjaar);
    }
}

class PersonenAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
        return new PersonenAuto(motor,remsysteem,kleur,bouwjaar);
    }
}

class BestelBusAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
        return new BestelBus(motor,remsysteem,kleur,bouwjaar);
    }
}