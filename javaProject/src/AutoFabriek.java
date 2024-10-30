abstract public class AutoFabriek {
    public AutoFabriek() {
    }

    public abstract Auto MaakAuto();
   //DIT IS NIET HOE JE EEN FACTORY GEBRUIKT
   //de veel to complexe constructor moet juist niet zichtbaar zijn voor de gebruiker
   // public abstract Auto MaakAuto(AandrijvingSelectie aandrijving, RemSysteem remsysteem, int bouwjaar, String kleur);

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

class AandrijfTest extends AutoFabriek {
    private int versie = 0;
    private AandrijvingSelectie[] selectie = {new DieselSelectie(), new ElektrischeSelectie(),new BenzineSelectie()};
    @Override
    public Auto MaakAuto() {
        Auto nieuw = new Aandrijver(selectie[versie].leverMotor(),selectie[versie].leverTank());
        versie = (versie + 1) % 3;
        return nieuw;
    }
}