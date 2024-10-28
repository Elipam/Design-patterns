public abstract class AandrijvingSelectie {
    public abstract Motor leverMotor();
    public abstract Tank leverTank();
}

class ElektrischeSelectie extends AandrijvingSelectie {

    @Override
    public Motor leverMotor() {
        return new ElectroMotor();
    }

    @Override
    public Tank leverTank() {
        return new Accu();
    }
}

class BenzineSelectie extends AandrijvingSelectie {

    @Override
    public Motor leverMotor() {
        return new BenzineMotor();
    }

    @Override
    public Tank leverTank() {
        return new BenzineTank();
    }
}