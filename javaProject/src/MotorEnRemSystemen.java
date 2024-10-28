abstract class Motor {
    /*TODO er voor zorgen dat alle motor subtypes dit ook doen
    misschien wat extra info fields toevoegen?
     */
    public void startMotor(Tank t){
            System.out.println("motor gebruikt " + t.getEnergieType() + " uit " + t.getTankType());
    };

    abstract public void stopMotor();

    abstract public void getMotorInfo();
}

class BenzineMotor extends Motor {
//ik heb ze even aangepast zodat ik ze kan gebruiken
    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}

abstract class DieselMotor extends Motor {
    public void startMotor() {
    }

    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}

class ElectroMotor extends Motor {

    public void stopMotor() {
    }

    public void getMotorInfo() {
    }
}


abstract class RemSysteem {
    abstract public void rem();

    abstract public void getRemInfo();

}

abstract class TrommelRemmen extends RemSysteem {
    public void rem() {
    }

    public void getRemInfo() {
    }

}

abstract class SchijfABSRemmen extends RemSysteem {
    public void rem() {
    }

    public void getRemInfo() {
    }

}

abstract class CarbonComposietRemmen extends RemSysteem {
    public void rem() {
    }

    public void getRemInfo() {
    }

}