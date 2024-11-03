package Remsysteem;

public class CarbonCompositeRemmen extends RemSysteem {
    @Override
    public void rem() {
        System.out.println("Applying carbon composite brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Carbon Composite Brakes";
    }
}