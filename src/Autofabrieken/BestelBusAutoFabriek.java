package Autofabrieken;

import Autos.*;
import Motor.Motor;
import Remsysteem.RemSysteem;

public class BestelBusAutoFabriek extends AutoFabriek {

  @Override
  public Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur){
    return new BestelBus(motor,remsysteem,kleur,bouwjaar);
  }

  @Override
  public Auto MaakAuto(){
    return new BestelBus();
  }
}
