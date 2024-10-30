abstract class Motor {
    /*TODO er voor zorgen dat alle motor subtypes dit ook doen
    misschien wat extra info fields toevoegen?
     */
    protected String type;

    public void startMotor(Tank t) {
        System.out.println(type + " verbruikt " + t.getEnergieType() + " uit " + t.getTankType());
    }

    abstract public void stopMotor();

    abstract public void getMotorInfo();
}

class BenzineMotor extends Motor {
    //ik heb ze even aangepast zodat ik ze kan gebruiken
    public BenzineMotor() {
        type = "BenzineMotor";
    }

    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}

class DieselMotor extends Motor {
    public DieselMotor() {
        type = "DieselMotor";
    }

    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}

class ElectroMotor extends Motor {
    public ElectroMotor() {
        type = "Elektromotor";
    }

    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}


abstract class RemSysteem {
    public String naam;

    abstract public void rem();

    abstract public void getRemInfo();

}

class TrommelRemmen extends RemSysteem {
    String naam = "TrommelRemmen";

    TrommelRemmen(){}

    public void rem() {
    }

    public void getRemInfo() {
    }

}

class SchijfABSRemmen extends RemSysteem {
    String naam = "SchijfABSRemmen";

    public void rem() {
    }

    public void getRemInfo() {
    }

}

class CarbonComposietRemmen extends RemSysteem {
    String naam = "CarbonComposietRemmen";

    public void rem() {
    }

    public void getRemInfo() {
    }

}