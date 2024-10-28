abstract public class AutoFabriek {
    public AutoFabriek() {
    }

    public abstract Auto MaakAuto(AandrijvingSelectie aandrijving, RemSysteem remsysteem, int bouwjaar, String kleur);

}

class SportAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(AandrijvingSelectie aandrijving, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new SportAuto();
    }
}

class PersonenAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(AandrijvingSelectie aandrijving, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new PersonenAuto();
    }
}

class BestelBusAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(AandrijvingSelectie aandrijving, RemSysteem remsysteem, int bouwjaar, String kleur) {
        return new BestelBus();
    }
}