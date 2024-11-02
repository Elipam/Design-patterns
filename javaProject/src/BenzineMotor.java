public class BenzineMotor extends Motor {
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
