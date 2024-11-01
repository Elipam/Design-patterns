package Autofabrieken;

import Autos.Auto;
import Autos.SportAuto;
import Motor.Motor;
import Remsysteem.RemSysteem;

public class SportAutoFabriek extends AutoFabriek {
    @Override
    public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
        return new SportAuto(motor,remsysteem,kleur,bouwjaar);
    }
    @Override
   public Auto MaakAuto(){
    return new SportAuto();
  }
}