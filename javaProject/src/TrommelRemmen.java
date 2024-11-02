public class TrommelRemmen extends RemSysteem {
    TrommelRemmen() {
    }

    @Override
    public void rem() {
        System.out.println("Applying trommel brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Trommel Brakes";
    }
}
