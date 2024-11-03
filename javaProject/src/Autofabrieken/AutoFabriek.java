package Autofabrieken;

import Autos.Auto;
import Motor.Motor;
import Remsysteem.RemSysteem;

abstract public class AutoFabriek {
    public AutoFabriek() {
    }

   public abstract Auto MaakAuto(Motor motor, RemSysteem remsysteem, int bouwjaar, String kleur);
   
}

