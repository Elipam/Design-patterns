public abstract class Motor {
    protected String type;
    //constructor


    // Method to start the motor
    public abstract void startMotor();

    // Method to stop the motor
    public abstract void stopMotor();

    // Method to get motor information
    public abstract String getMotorInfo();
}

class BenzineMotor extends Motor {
    public BenzineMotor() {
        type = "BenzineMotor";
    }
    @Override
    public void startMotor() {
        System.out.println("Starting benzine motor.");
    }

    @Override
    public void stopMotor() {
        System.out.println("Stopping benzine motor.");
    }

    @Override
    public String getMotorInfo() {
        return "benzine motor";
    }
}
class DieselMotor extends Motor {
    public DieselMotor() {
        type = "DieselMotor";
    }
    @Override
    public void startMotor() {
        System.out.println("Starting diesel motor.");
    }

    @Override
    public void stopMotor() {
        System.out.println("Stopping diesel motor.");
    }

    @Override
    public String getMotorInfo() {
        return "diesel motor";
    }
}
class ElektroMotor extends Motor {
    public ElektroMotor() {
        type = "Elektromotor";
    }
    @Override
    public void startMotor() {
        System.out.println("Starting elektro motor.");
    }

    @Override
    public void stopMotor() {
        System.out.println("Stopping elektro motor.");
    }

    @Override
    public String getMotorInfo() {
        return "elektro motor";
    }
}
