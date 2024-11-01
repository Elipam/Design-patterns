package Motor;

public class ElektroMotor extends Motor {
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