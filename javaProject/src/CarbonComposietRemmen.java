public class CarbonComposietRemmen extends RemSysteem {
    CarbonComposietRemmen(){}
    @Override
    public void rem() {
        System.out.println("Applying carbon composite brakes.");
    }

    @Override
    public String getRemInfo() {
        return "Carbon Composite Brakes";
    }
}
