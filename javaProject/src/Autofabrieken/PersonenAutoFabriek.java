package Autofabrieken;

import Autos.Auto;
import Autos.PersonenAuto;
import Motor.Motor;
import Remsysteem.RemSysteem;

public class PersonenAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
        return new PersonenAuto(motor,remsysteem,kleur,bouwjaar);
    }
    @Override
   public Auto MaakAuto(){
    return new PersonenAuto();
  }
}