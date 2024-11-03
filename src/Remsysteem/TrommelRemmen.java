package Remsysteem;

public class TrommelRemmen extends RemSysteem {
    @Override
    public void rem() {
        System.out.println("Applying trommel brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Trommel Brakes";
    }
}