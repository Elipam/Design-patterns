abstract public class AutoFabriek {
    public AutoFabriek() {
    }

    public abstract AbstracteAuto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur);

}

class SportAutoFabriek extends AutoFabriek {
    @Override
    public AbstracteAuto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new SportAuto();
    }
}

class PersonenAutoFabriek extends AutoFabriek {
    @Override
    public AbstracteAuto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new PersonenAuto();
    }
}

class BestelBusAutoFabriek extends AutoFabriek {
    @Override
    public AbstracteAuto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new BestelBus();
    }
}