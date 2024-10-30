public abstract class Tank {
    protected String energieType;
    protected String TankType;

    public String getEnergieType(){
        return energieType;
    }

    public String getTankType() {
        return TankType;
    }


}

class BenzineTank extends Tank{
    public BenzineTank(){
        energieType = "Benzine";
        TankType = "BenzineTank";
    }

}

class Accu extends Tank{
    public Accu(){
        energieType = "Electriciteit";
        TankType = "Accu";
    }
}

class DieselTank extends Tank{
    public DieselTank(){
        energieType = "Diesel";
        TankType = "DieselTank";
    }

}