abstract class Motor {
    abstract public void startMotor();

    abstract public void stopMotor();

    abstract public void getMotorInfo();
}

abstract class BenzineMotor extends Motor {
    public void startMotor() {
    }

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

abstract class ElectroMotor extends Motor {
    public void startMotor() {
    }

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