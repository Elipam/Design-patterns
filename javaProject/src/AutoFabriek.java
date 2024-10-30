abstract public class AutoFabriek {
    public AutoFabriek() {
    }

    public abstract Auto MaakAuto();
   //DIT IS NIET HOE JE EEN FACTORY GEBRUIKT
   //de veel to complexe constructor moet juist niet zichtbaar zijn voor de gebruiker
   // public abstract Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur);

}

class SportAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto() {
        return new SportAuto();
    }
}

class PersonenAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto() {
        return new PersonenAuto();
    }
}

class BestelBusAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto() {
        return new BestelBus();
    }
}