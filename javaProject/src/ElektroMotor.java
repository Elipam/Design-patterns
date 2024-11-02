public class ElektroMotor extends Motor {
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
