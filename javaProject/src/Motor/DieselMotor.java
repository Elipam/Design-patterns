package Motor;

public class DieselMotor extends Motor {
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