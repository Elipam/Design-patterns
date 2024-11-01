public abstract class Motor {

    // Method to start the motor
    public abstract void startMotor();

    // Method to stop the motor
    public abstract void stopMotor();

    // Method to get motor information
    public abstract String getMotorInfo();
}

class BenzineMotor extends Motor {
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
        return "Benzine Motor";
    }
}
class DieselMotor extends Motor {
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
        return "Diesel Motor";
    }
}
class ElektroMotor extends Motor {
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
        return "Elektro Motor";
    }
}